package com.trading;

import javax.persistence.*;

/**
 * @author Tomer Cohen
 */
@Entity
@Table(name = "sec_master_tbl")
public class SecMaster implements TradingEntity {
    private Long securityId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "security_id")
    public Long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(Long securityId) {
        this.securityId = securityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SecMaster secMaster = (SecMaster) o;

        return securityId.equals(secMaster.securityId);

    }

    @Override
    public int hashCode() {
        return securityId.hashCode();
    }
}
