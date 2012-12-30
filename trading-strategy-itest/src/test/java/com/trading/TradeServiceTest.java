package com.trading;

import com.trading.dao.TradeDao;
import com.trading.service.TradeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static junit.framework.Assert.assertEquals;

/**
 * @author Tomer Cohen
 */
public class TradeServiceTest extends AbstractServiceTest {
    @Autowired
    private TradeService tradeService;

    @Autowired
    private TradeDao tradeDao;

    @Test
    public void persist() {
        Trade trade = new Trade();
        tradeService.persist(trade);

        Trade dbTrade = tradeDao.find(1L);
        assertEquals(dbTrade, trade);
    }
}
