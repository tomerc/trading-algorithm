package com.trading;

import javax.persistence.*;

/**
 * @author Tomer Cohen
 */
@Entity
@Table(name = "trade_tbl")
public class Trade implements TradingEntity {
    private Long tradeId;

    @Id
    @Column(name = "trade_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trade trade = (Trade) o;

        return tradeId.equals(trade.tradeId);

    }

    @Override
    public int hashCode() {
        return tradeId.hashCode();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Trade");
        sb.append("{tradeId=").append(tradeId);
        sb.append('}');
        return sb.toString();
    }
}
