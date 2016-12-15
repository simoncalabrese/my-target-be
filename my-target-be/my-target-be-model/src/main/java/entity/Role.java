package entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by simon on 05/12/16.
 */
@Entity
@Table(name = "ANAG_ROLE")
public class Role implements IEntity {
    @Id
    @Column(
            name = "ROLE_K"
    )
    private Integer roleK;

    @Column(
            name = "COD_ROLE"
    )
    private String codRole;

    @Column(
            name = "DES_ROLE"
    )
    private String desRole;

    @OneToMany(
            mappedBy = "role",
            fetch = FetchType.LAZY)
    private List<Person> persons;

    public Integer getRoleK() {
        return roleK;
    }

    public void setRoleK(Integer roleK) {
        this.roleK = roleK;
    }

    public String getCodRole() {
        return codRole;
    }

    public void setCodRole(String codRole) {
        this.codRole = codRole;
    }

    public String getDesRole() {
        return desRole;
    }

    public void setDesRole(String desRole) {
        this.desRole = desRole;
    }
}
