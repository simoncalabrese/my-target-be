package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by simon on 15/12/16.
 */
@Entity
@Table(name = "ANAG_PROMOTION")
public class Promotion implements IEntity {
    @Id
    @Column(name = "PROMOTION_K",
            nullable = false)
    private Integer promotionK;
    @Column(
            name = "COD_PROMOTION",
            nullable = false,
            unique = true
    )
    private String codPromotion;

    @Column(name = "DES_PROMOTION")
    private String desPromotion;

    @Column(name = "FLG_GOLD",
            columnDefinition = "CHAR(1)")
    private Boolean flgGold;

    @ManyToOne
    @JoinColumn(
            name = "PAYMENT_TYPE_FK"
    )
    private PaymentType paymentType;

    public Integer getPromotionK() {
        return promotionK;
    }

    public void setPromotionK(Integer promotionK) {
        this.promotionK = promotionK;
    }

    public String getCodPromotion() {
        return codPromotion;
    }

    public void setCodPromotion(String codPromotion) {
        this.codPromotion = codPromotion;
    }

    public String getDesPromotion() {
        return desPromotion;
    }

    public void setDesPromotion(String desPromotion) {
        this.desPromotion = desPromotion;
    }

    public Boolean getFlgGold() {
        return flgGold;
    }

    public void setFlgGold(Boolean flgGold) {
        this.flgGold = flgGold;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
