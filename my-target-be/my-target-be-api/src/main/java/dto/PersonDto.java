package dto;

/**
 * Created by simon on 18/12/16.
 */
public class PersonDto {

    private Integer personK;
    private String desPerson;
    private String fiscalCode;
    private String pIva;
    private Boolean flgAgent;
    private String userName;
    private String password;
    private PersonDto personParent;
    private RoleDto role;

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

    public PersonDto getPersonParent() {
        return personParent;
    }

    public void setPersonParent(PersonDto personParent) {
        this.personParent = personParent;
    }

    public RoleDto getRole() {
        return role;
    }

    public void setRole(RoleDto role) {
        this.role = role;
    }
}
