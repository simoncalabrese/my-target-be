package entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by simon on 11/12/16.
 */
@Entity
@Table(name = "ANAG_PERSON_POSTATION")
public class PersonPostation {
    @Id
    @Column(name = "PERSON_POSTATION_K",
            nullable = false,
            unique = true)
    private Integer personPostationK;
    @ManyToOne
    @JoinColumn(
            name = "PERSON_FK",
            nullable = false
    )
    private Person person;
    @ManyToOne
    @JoinColumn(name = "POSTATION_FK",
            nullable = false
    )
    private Postation postation;

    @Column(
            name = "DT_ASSIGN",
            columnDefinition = "DATE"
    )
    private LocalDate dtAssign;

    public Integer getPersonPostationK() {
        return personPostationK;
    }

    public void setPersonPostationK(Integer personPostationK) {
        this.personPostationK = personPostationK;
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

    public LocalDate getDtAssign() {
        return dtAssign;
    }

    public void setDtAssign(LocalDate dtAssign) {
        this.dtAssign = dtAssign;
    }
}
