package entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by simon on 11/12/16.
 */
@Entity
@Table(
        name = "ANAG_PAYMENT_TYPE"
)
public class PaymentType implements IEntity {

    @Id
    @Column(name = "PAYMENT_TYPE_K",
            nullable = false,
            unique = true)
    private Integer paymentTypeK;

    @Column(name = "COD_PAYMENT_TYPE",
            nullable = false,
            unique = true)
    private String codPaymentType;

    @Column(name = "DES_PAYMENT_TYPE")
    private String desPaymentType;

    @OneToMany(mappedBy = "paymentType")
    private List<Promotion> promotions;

    public Integer getPaymentTypeK() {
        return paymentTypeK;
    }

    public void setPaymentTypeK(Integer paymentTypeK) {
        this.paymentTypeK = paymentTypeK;
    }

    public String getCodPaymentType() {
        return codPaymentType;
    }

    public void setCodPaymentType(String codPaymentType) {
        this.codPaymentType = codPaymentType;
    }

    public String getDesPaymentType() {
        return desPaymentType;
    }

    public void setDesPaymentType(String desPaymentType) {
        this.desPaymentType = desPaymentType;
    }

    public List<Promotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }
}
