
package Model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Staff implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Integer s_id;
    @Column(name = "Staffid", unique = true)
    private String staffid;
    private String firstname;
    private String lastname;
    private String s_address;
    private String s_age;
    @OneToOne 
    @JoinColumn(name = "id")
    private Accounts account;
    @ManyToOne
    @JoinColumn(name = "dep_id")
    private Department departments;

    public Staff() {
    }

    public Staff(String staffid) {
        this.staffid = staffid;
    }

    public Staff(String staffid, String firstname, String lastname, String s_address, String s_age, Accounts account, Department departments) {
        this.staffid = staffid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.s_address = s_address;
        this.s_age = s_age;
        this.account = account;
        this.departments = departments;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getS_address() {
        return s_address;
    }

    public void setS_address(String s_address) {
        this.s_address = s_address;
    }

    public String getS_age() {
        return s_age;
    }

    public void setS_age(String s_age) {
        this.s_age = s_age;
    }

    public Accounts getAccount() {
        return account;
    }

    public void setAccount(Accounts account) {
        this.account = account;
    }

    public Department getDepartments() {
        return departments;
    }

    public void setDepartments(Department departments) {
        this.departments = departments;
    }

    

        
}
