package dao;

import entity.IEntity;
import exceptions.BeException;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@SuppressWarnings("unchecked")
public interface BaseDao<E extends IEntity> {

    default Class<E> getEntityType(){
        return (Class<E>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    E find(Integer key);

    CriteriaBuilder getCriteriaBuilder();

    List<E> getResultList(final CriteriaQuery<E> query);

    List<E> getResultListPaginated(final CriteriaQuery<E> query, final Pagination pagination);

    <T> List<T> getResultListGeneric(final CriteriaQuery<T> genericQuery);

    <T> List<T> getResultiListGenericPaginated(CriteriaQuery<T> genericQuery,
                                               Pagination pagination);

    E getSingleResult(CriteriaQuery<E> query) throws IllegalAccessException, InstantiationException, BeException;

    <T> T getSingleResultGeneric(CriteriaQuery<T> genericQuery);

    <T> T getCountResult(CriteriaQuery<T> query);

    Number getCountResultGeneric(CriteriaQuery<Number> query, Function<Number, Number> numberConverter);
}
