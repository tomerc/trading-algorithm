package com.trading;

import javax.persistence.*;
import java.util.Collection;

/**
 * @author Tomer Cohen
 */
@Entity
@Table(name = "position_tbl")
public class Position implements TradingEntity {
    private Long positionId;
    private SecMaster secMaster;
    private Collection<Trade> trades;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "position_id")
    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    @OneToOne(targetEntity = SecMaster.class)
    @JoinColumn(name = "sec_master_fk")
    public SecMaster getSecMaster() {
        return secMaster;
    }

    public void setSecMaster(SecMaster secMaster) {
        this.secMaster = secMaster;
    }

    @OneToMany(targetEntity = Trade.class)
    @JoinColumn(name = "trade_fk")
    public Collection<Trade> getTrades() {
        return trades;
    }

    public void setTrades(Collection<Trade> trades) {
        this.trades = trades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        return positionId.equals(position.positionId);

    }

    @Override
    public int hashCode() {
        return positionId.hashCode();
    }
}
