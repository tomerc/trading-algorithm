package com.trading.service;

import com.trading.Trade;
import com.trading.dao.TradeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Tomer Cohen
 */
@Service
public class TradeServiceImpl implements TradeService {
    @Autowired
    private TradeDao tradeDao;

    @Override
    @Transactional
    public void persist(Trade trade) {
        tradeDao.persist(trade);
    }
}
