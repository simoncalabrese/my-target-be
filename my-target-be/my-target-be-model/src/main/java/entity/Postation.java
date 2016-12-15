package entity;

import javax.persistence.*;

/**
 * Created by simon on 11/12/16.
 */
@Entity
@Table(
        name = "ANAG_POSTATION"
)
public class Postation implements IEntity{

    @Id
    @Column(name = "POSTATION_K")
    private Integer postationK;

    @Column(name = "COD_POSTATION")
    private String codPostation;

    @Column(name = "DES_POSTATION")
    private String desPostation;

    @ManyToOne
    @JoinColumn(name = "STRUCTURE_FK")
    private Structure structure;

    public Integer getPostationK() {
        return postationK;
    }

    public void setPostationK(Integer postationK) {
        this.postationK = postationK;
    }

    public String getCodPostation() {
        return codPostation;
    }

    public void setCodPostation(String codPostation) {
        this.codPostation = codPostation;
    }

    public String getDesPostation() {
        return desPostation;
    }

    public void setDesPostation(String desPostation) {
        this.desPostation = desPostation;
    }

    public Structure getStructure() {
        return structure;
    }

    public void setStructure(Structure structure) {
        this.structure = structure;
    }
}
