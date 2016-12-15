package entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

/**
 * Created by simon on 15/12/16.
 */
public class Target implements IEntity {

    @Id
    @Column(name = "TARGET_K")
    private Integer targetK;

    @Column(name = "AMNT_ATT_TOT",
            columnDefinition = "INT(11)")
    private Long amntAttTot;

    @Column(name = "AMNT_HV_TOT",
            columnDefinition = "INT(11)")
    private Long amntHvTot;

    @Column(name = "AMNT_LVT_TOT",
            columnDefinition = "INT(11)")
    private Long amntLVTot;

    @Column(name = "AMNT_LV_V",
            columnDefinition = "INT(11)")
    private Long amntLvV;

    @ManyToOne
    @JoinColumn(name = "POSTATION_FK",
            columnDefinition = "INT(11)")
    private Postation postation;

    @Column(name = "DT_START_REF")
    private LocalDate dtRef;

    @Column(name = "FLG_CLOSED",
            columnDefinition = "CHAR(1)")
    private Boolean flgClosed;

    public Integer getTargetK() {
        return targetK;
    }

    public void setTargetK(Integer targetK) {
        this.targetK = targetK;
    }

    public Long getAmntAttTot() {
        return amntAttTot;
    }

    public void setAmntAttTot(Long amntAttTot) {
        this.amntAttTot = amntAttTot;
    }

    public Long getAmntHvTot() {
        return amntHvTot;
    }

    public void setAmntHvTot(Long amntHvTot) {
        this.amntHvTot = amntHvTot;
    }

    public Long getAmntLVTot() {
        return amntLVTot;
    }

    public void setAmntLVTot(Long amntLVTot) {
        this.amntLVTot = amntLVTot;
    }

    public Long getAmntLvV() {
        return amntLvV;
    }

    public void setAmntLvV(Long amntLvV) {
        this.amntLvV = amntLvV;
    }

    public Postation getPostation() {
        return postation;
    }

    public void setPostation(Postation postation) {
        this.postation = postation;
    }

    public LocalDate getDtRef() {
        return dtRef;
    }

    public void setDtRef(LocalDate dtRef) {
        this.dtRef = dtRef;
    }

    public Boolean getFlgClosed() {
        return flgClosed;
    }

    public void setFlgClosed(Boolean flgClosed) {
        this.flgClosed = flgClosed;
    }
}
