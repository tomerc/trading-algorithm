package com.trading;

import com.trading.dao.TradeDao;
import org.springframework.stereotype.Repository;

/**
 * @author Tomer Cohen
 */
@Repository
public class TradeDaoImpl extends BaseDaoImpl<Trade> implements TradeDao {
    public TradeDaoImpl() {
        super(Trade.class);
    }
}
