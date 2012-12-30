package com.trading.service;

import com.trading.UserStrategy;

import java.util.List;

/**
 * @author arun
 */
public interface StrategyService {
    public List<String> getStrategies(Long userId);

    void persist(UserStrategy userStrategy);
}
