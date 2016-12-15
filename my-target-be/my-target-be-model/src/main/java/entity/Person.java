package entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;
/**
 * Created by simon on 06/12/16.
 */
@Entity
@Table(
        name = "ANAG_PERSON"
)
public class Person implements IEntity {

    @Id
    @Column(name = "PERSON_K")
    private Integer personK;

    @Column(name = "DES_PERSON")
    private String desPerson;

    @Column(name = "FISCAL_CODE",
            nullable = false,
            updatable = false)
    private String fiscalCode;

    @Column(name = "P_IVA",
            nullable = false,
            updatable = false)
    private String pIva;

    @Column(name = "FLG_AGENT",
            columnDefinition = "CHAR(1)")
    private Boolean flgAgent;

    @Column(
            name = "LOGIN_USERNAME",
            nullable = false,
            updatable = false
    )
    private String userName;

    @Column(
            name = "LOGIN_PASSWORD",
            nullable = false,
            updatable = false
    )
    private String password;

    @ManyToOne
    @JoinColumn(
            name = "PERSON_PARENT_FK"
    )
    private Person personParent;

    @ManyToOne
    @JoinColumn(
            name = "ROLE_FK"
    )
    private Role role;

    @Transient
    private List<Person> children;

    public Integer getPersonK() {
        return personK;
    }

    public void setPersonK(Integer personK) {
        this.personK = personK;
    }

    public String getDesPerson() {
        return desPerson;
    }

    public void setDesPerson(String desPerson) {
        this.desPerson = desPerson;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public String getpIva() {
        return pIva;
    }

    public void setpIva(String pIva) {
        this.pIva = pIva;
    }

    public Boolean getFlgAgent() {
        return flgAgent;
    }

    public void setFlgAgent(Boolean flgAgent) {
        this.flgAgent = flgAgent;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPersonParent() {
        return personParent;
    }

    public void setPersonParent(Person personParent) {
        this.personParent = personParent;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }
}
