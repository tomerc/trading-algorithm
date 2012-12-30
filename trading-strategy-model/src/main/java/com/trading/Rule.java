package com.trading;

import javax.persistence.*;
import java.util.Collection;

/**
 * @author Tomer Cohen
 */
@Entity
@Table(name = "rule_tbl")
public class Rule implements TradingEntity {
    private Long ruleId;
    private Collection<Strategy> strategies;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rule_id")
    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    @ManyToMany(targetEntity = Strategy.class)
    public Collection<Strategy> getStrategies() {
        return strategies;
    }

    public void setStrategies(Collection<Strategy> strategies) {
        this.strategies = strategies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rule rule = (Rule) o;

        return ruleId.equals(rule.ruleId);

    }

    @Override
    public int hashCode() {
        return ruleId.hashCode();
    }
}
