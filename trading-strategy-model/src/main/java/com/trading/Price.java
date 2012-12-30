package com.trading;

import javax.persistence.*;

/**
 * @author Tomer Cohen
 */
@Entity
@Table(name = "price_tbl")
public class Price implements TradingEntity {
    private Long priceId;
    private SecMaster secMaster;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "price_id")
    public Long getPriceId() {
        return priceId;
    }

    public void setPriceId(Long priceId) {
        this.priceId = priceId;
    }

    @OneToOne(targetEntity = SecMaster.class)
    @JoinColumn(name = "sec_master_fk")
    public SecMaster getSecMaster() {
        return secMaster;
    }

    public void setSecMaster(SecMaster secMaster) {
        this.secMaster = secMaster;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Price price = (Price) o;

        return priceId.equals(price.priceId);

    }

    @Override
    public int hashCode() {
        return priceId.hashCode();
    }
}
