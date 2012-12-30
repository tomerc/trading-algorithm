package com.trading.dao;

import com.trading.TradingEntity;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tomer Cohen
 */
public interface BaseDao<T extends TradingEntity> {
    T find(Serializable id);

    List<T> findAll();

    void persist(T entity);
}
