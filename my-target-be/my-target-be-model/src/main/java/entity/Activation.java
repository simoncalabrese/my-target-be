package entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by simon on 15/12/16.
 */
@Entity
@Table(name = "APP_ACTIVATION")
public class Activation implements IEntity {

    @Id
    @Column(name = "ACTIVATION_K",
            nullable = false)
    private Integer activationK;

    @ManyToOne
    @JoinColumn(
            name = "PERSON_FK"
    )
    private Person person;

    @ManyToOne
    @JoinColumn(
            name = "POSTATION_FK"
    )
    private Postation postation;

    @Column(name = "DT_REF")
    private LocalDate dtRif;

    @Column(name = "FLG_COMPASS",
            columnDefinition = "CHAR(1)")
    private Boolean flgCompass;
    @ManyToOne
    @JoinColumn(
            name = "PAYMENT_TYPE_FK"
    )
    private PaymentType paymentType;

    @Column(
            name = "COD_COMPASS"
    )
    private String codCompass;

    public Integer getActivationK() {
        return activationK;
    }

    public void setActivationK(Integer activationK) {
        this.activationK = activationK;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Postation getPostation() {
        return postation;
    }

    public void setPostation(Postation postation) {
        this.postation = postation;
    }

    public LocalDate getDtRif() {
        return dtRif;
    }

    public void setDtRif(LocalDate dtRif) {
        this.dtRif = dtRif;
    }

    public Boolean getFlgCompass() {
        return flgCompass;
    }

    public void setFlgCompass(Boolean flgCompass) {
        this.flgCompass = flgCompass;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public String getCodCompass() {
        return codCompass;
    }

    public void setCodCompass(String codCompass) {
        this.codCompass = codCompass;
    }
}
