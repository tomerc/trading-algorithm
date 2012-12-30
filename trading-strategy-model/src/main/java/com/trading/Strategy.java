package com.trading;

import javax.persistence.*;
import java.util.Collection;

/**
 * @author Tomer Cohen
 */
@Entity
@Table(name = "strategy_tbl")
public class Strategy implements TradingEntity {
    private Long strategyId;
    private String strategyName;
    private Collection<Rule> rules;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToMany(targetEntity = Rule.class)
    public Collection<Rule> getRules() {
        return rules;
    }

    public void setRules(Collection<Rule> rules) {
        this.rules = rules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Strategy strategy = (Strategy) o;

        return strategyId.equals(strategy.strategyId);
    }

    @Override
    public int hashCode() {
        return strategyId.hashCode();
    }
}
