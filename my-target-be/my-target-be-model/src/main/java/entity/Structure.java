package entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by simon on 11/12/16.
 */
@Entity
@Table(
        name = "ANAG_STRUCTURE"
)
public class Structure implements IEntity {

    @Id
    @Column(
            name = "STRUCTURE_K"
    )
    private Integer structureK;
    @Column(name = "COD_STRUCTURE")
    private String codStructure;

    @Column(name = "DES_STRUCTURE")
    private String desStructure;

    @ManyToOne
    @JoinColumn(name = "STRUCTURE_PARENT_FK")
    private Structure structureParent;

    @OneToMany(mappedBy = "structure")
    private List<Postation> postations;

    @Transient
    private List<Structure> structureSons;

    public Integer getStructureK() {
        return structureK;
    }

    public void setStructureK(Integer structureK) {
        this.structureK = structureK;
    }

    public String getCodStructure() {
        return codStructure;
    }

    public void setCodStructure(String codStructure) {
        this.codStructure = codStructure;
    }

    public String getDesStructure() {
        return desStructure;
    }

    public void setDesStructure(String desStructure) {
        this.desStructure = desStructure;
    }

    public Structure getStructureParent() {
        return structureParent;
    }

    public void setStructureParent(Structure structureParent) {
        this.structureParent = structureParent;
    }

    public List<Structure> getStructureSons() {
        return structureSons;
    }

    public void setStructureSons(List<Structure> structureSons) {
        this.structureSons = structureSons;
    }

    public List<Postation> getPostations() {
        return postations;
    }

    public void setPostations(List<Postation> postations) {
        this.postations = postations;
    }
}
