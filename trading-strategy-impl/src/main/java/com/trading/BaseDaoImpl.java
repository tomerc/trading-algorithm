package com.trading;

import com.trading.dao.BaseDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.util.List;

/**
 * @author Tomer Cohen
 */
public abstract class BaseDaoImpl<T extends TradingEntity> implements BaseDao<T> {
    @PersistenceContext
    protected EntityManager entityManager;

    private Class<T> clazz;

    public BaseDaoImpl(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public T find(Serializable id) {
        return entityManager.find(clazz, id);
    }

    @Override
    public List<T> findAll() {
        CriteriaQuery<T> query = entityManager.getCriteriaBuilder().createQuery(clazz);
        query.from(clazz);
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void persist(T entity) {
        entityManager.persist(entity);
    }
}
