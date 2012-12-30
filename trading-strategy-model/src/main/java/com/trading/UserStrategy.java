package com.trading;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author arun
 */
@Entity
@Table(name = "user_strategy_tbl")
public class UserStrategy implements TradingEntity {
    private Long userId;
    private Long strategyId;
    private String strategyName;

    public UserStrategy(long userId, long strategyId, String strategyName) {
        this.userId = userId;
        this.strategyId = strategyId;
        this.strategyName = strategyName;
    }

    public UserStrategy() {

    }

    @Id
    @Column(name = "user_id")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Column(name = "strategy_id")
    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    @Column(name = "strategy_name")
    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserStrategy that = (UserStrategy) o;

        return userId.equals(that.userId);

    }

    @Override
    public int hashCode() {
        return userId.hashCode();
    }
}
