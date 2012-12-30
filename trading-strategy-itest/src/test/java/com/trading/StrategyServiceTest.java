package com.trading;

import com.trading.dao.UserStrategyDao;
import com.trading.service.StrategyService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * @author arun
 */
public class StrategyServiceTest extends AbstractServiceTest {
    @Autowired
    private StrategyService strategyService;

    @Autowired
    private UserStrategyDao userStrategyDao;

    @Test
    public void getStrategies() {
        UserStrategy userStrategy = new UserStrategy(1L, 1L, "PutBased");
        strategyService.persist(userStrategy);
        List<String> strategies = new ArrayList<String>();
        strategies.add("PutBased");
        List<String> dbStrategies = strategyService.getStrategies(1L);

        assertEquals(dbStrategies, strategies);
    }
}
