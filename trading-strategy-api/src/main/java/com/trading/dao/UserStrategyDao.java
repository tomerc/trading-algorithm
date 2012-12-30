package com.trading.dao;

import com.trading.UserStrategy;

import java.util.List;

/**
 * @author arun
 */
public interface UserStrategyDao extends BaseDao<UserStrategy> {
    public List<UserStrategy> get(Long userId);
}
