package dao;

import entity.IEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by simon on 15/12/16.
 */
public class BaseDaoImp<E extends IEntity> implements BaseDao<E> {
    @PersistenceContext(unitName = "my-target-be-model")
    private static EntityManager entityManager;

    @Override
    public CriteriaBuilder getCriteriaBuilder() {
        return entityManager.getCriteriaBuilder();
    }

    @Override
    public final List getResultList(final CriteriaQuery query) {
        return getResultListPaginated(query, null);
    }

    @Override
    public List getResultListPaginated(final CriteriaQuery query,
                                       final Pagination pagination) {
        return addPagination(entityManager.createQuery(query), pagination)
                .getResultList();
    }

    @Override
    public <T> List<T> getResultListGeneric(final CriteriaQuery<T> genericQuery) {
        return getResultiListGenericPaginated(genericQuery, null);
    }

    public <T> List<T> getResultiListGenericPaginated(final CriteriaQuery<T> genericQuery,
                                                      final Pagination pagination) {
        return addPaginationGeneric(entityManager.createQuery(genericQuery), pagination)
                .getResultList();
    }

    @Override
    public E getSingleResult(CriteriaQuery<E> query) {
        return entityManager.createQuery(query).getSingleResult();
    }

    @Override
    public <T> T getSingleResultGeneric(CriteriaQuery<T> genericQuery) {
        return entityManager.createQuery(genericQuery).getSingleResult();
    }

    private TypedQuery<E> addPagination(final TypedQuery<E> query,
                                        final Pagination pagination) {

        Predicate<Pagination> valid = e ->
                e.getStartValue() != null
                        && e.getStartValue() != null
                        && Integer.compare(e.getStartValue(), 0) >= 0
                        && Integer.compare(e.getEndValue(), 0) > 0;

        if (pagination == null) {
            return query;
        }

        if (valid.test(pagination)) {
            query.setFirstResult(pagination.getStartValue());
            query.setMaxResults(pagination.getEndValue());
        }
        return query;
    }

    private <T> TypedQuery<T> addPaginationGeneric(final TypedQuery<T> query,
                                                   final Pagination pagination) {

        Predicate<Pagination> valid = e ->
                e.getStartValue() != null
                        && e.getStartValue() != null
                        && Integer.compare(e.getStartValue(), 0) >= 0
                        && Integer.compare(e.getEndValue(), 0) > 0;

        if (pagination == null) {
            return query;
        }

        if (valid.test(pagination)) {
            query.setFirstResult(pagination.getStartValue());
            query.setMaxResults(pagination.getEndValue());
        }
        return query;
    }
}
