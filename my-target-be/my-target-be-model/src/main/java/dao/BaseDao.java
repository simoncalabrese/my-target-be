package dao;

import entity.IEntity;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.lang.reflect.ParameterizedType;
import java.util.List;

@SuppressWarnings("unchecked")
public interface BaseDao<E extends IEntity> {

    default Class<E> getEntityType(){
        return (Class<E>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    CriteriaBuilder getCriteriaBuilder();

    List<E> getResultList(final CriteriaQuery<E> query);

    List<E> getResultListPaginated(final CriteriaQuery<E> query, final Pagination pagination);

    <T> List<T> getResultListGeneric(final CriteriaQuery<T> genericQuery);

    E getSingleResult(CriteriaQuery<E> query);

    <T> T getSingleResultGeneric(CriteriaQuery<T> genericQuery);
}
