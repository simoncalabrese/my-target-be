package dao;

import entity.IEntity;
import exceptions.BeException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import javax.persistence.criteria.Predicate;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.function.*;

/**
 * Created by simon on 15/12/16.
 */
public class BaseDaoImp<E extends IEntity> implements BaseDao<E>, Serializable {
    @PersistenceContext(unitName = "my-target-be-model")
    private static EntityManager entityManager;

    @Override
    public E find(final Integer key) {
        return entityManager.find(getEntityType(), key);
    }

    @Override
    public CriteriaBuilder getCriteriaBuilder() {
        return entityManager.getCriteriaBuilder();
    }

    @Override
    public final List<E> getResultList(final CriteriaQuery query) {
        return getResultListPaginated(query, null);
    }

    @Override
    public List<E> getResultListPaginated(final CriteriaQuery query,
                                          final Pagination pagination) {
        return addPagination(entityManager.createQuery(query), pagination)
                .getResultList();
    }

    @Override
    public <T> List<T> getResultListGeneric(final CriteriaQuery<T> genericQuery) {
        return getResultiListGenericPaginated(genericQuery, null);
    }

    @Override
    public <T> List<T> getResultiListGenericPaginated(final CriteriaQuery<T> genericQuery,
                                                      final Pagination pagination) {
        return addPaginationGeneric(entityManager.createQuery(genericQuery), pagination)
                .getResultList();
    }

    @Override
    public E getSingleResult(CriteriaQuery<E> query) throws BeException {
        return entityManager.createQuery(query).getSingleResult();
    }

    @Override
    public <T> T getSingleResultGeneric(CriteriaQuery<T> genericQuery) {
        return getResultListGeneric(genericQuery).stream().findFirst().orElse(null);
    }

    @Override
    public <T> T getCountResult(final CriteriaQuery<T> query) {
        return entityManager.createQuery(query).getSingleResult();
    }

    @Override
    public Number getCountResultGeneric(final CriteriaQuery<Number> query, Function<Number, Number> numberConverter) {
        return entityManager.createQuery(query).getSingleResult();
    }

    private TypedQuery<E> addPagination(final TypedQuery<E> query,
                                        final Pagination pagination) {

        Boolean valid = pagination.getStartValue() != null
                && pagination.getStartValue() != null
                && Integer.compare(pagination.getStartValue(), 0) >= 0
                && Integer.compare(pagination.getEndValue(), 0) > 0;

        if (pagination == null) {
            return query;
        }

        if (valid) {
            query.setFirstResult(pagination.getStartValue());
            query.setMaxResults(pagination.getEndValue());
        }
        return query;
    }

    private <T> TypedQuery<T> addPaginationGeneric(final TypedQuery<T> query,
                                                   final Pagination pagination) {

        Boolean valid = pagination.getStartValue() != null
                && pagination.getStartValue() != null
                && Integer.compare(pagination.getStartValue(), 0) >= 0
                && Integer.compare(pagination.getEndValue(), 0) > 0;

        if (pagination == null) {
            return query;
        }

        if (valid) {
            query.setFirstResult(pagination.getStartValue());
            query.setMaxResults(pagination.getEndValue());
        }
        return query;
    }
}
