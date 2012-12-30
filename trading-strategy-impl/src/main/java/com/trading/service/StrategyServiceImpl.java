package com.trading.service;

import com.trading.UserStrategy;
import com.trading.dao.UserStrategyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class StrategyServiceImpl implements StrategyService {
    @Autowired
    private UserStrategyDao userStrategyDao;

    @Override
    @Transactional(readOnly = true)
    public List<String> getStrategies(Long userId) {
        List<UserStrategy> userStrategies = userStrategyDao.get(userId);
        List<String> strategies = new ArrayList<String>();
        for (UserStrategy userStrategy : userStrategies) {
            strategies.add(userStrategy.getStrategyName());
        }
        return strategies;
    }

    @Override
    @Transactional
    public void persist(UserStrategy userStrategy) {
        userStrategyDao.persist(userStrategy);
    }
}
