
package Model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
public class Collaborator implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer co_id;
    private String co_name;
    private String co_contact;
    private String co_address;
    @ManyToMany(mappedBy = "collaborators")
    private Set<Event> events=new HashSet<>();

    public Collaborator() {
    }

    public Collaborator(Integer co_id) {
        this.co_id = co_id;
    }

    public Collaborator(Integer co_id, String co_name, String co_contact, String co_address) {
        this.co_id = co_id;
        this.co_name = co_name;
        this.co_contact = co_contact;
        this.co_address = co_address;
    }

    public Integer getCo_id() {
        return co_id;
    }

    public void setCo_id(Integer co_id) {
        this.co_id = co_id;
    }

    public String getCo_name() {
        return co_name;
    }

    public void setCo_name(String co_name) {
        this.co_name = co_name;
    }

    public String getCo_contact() {
        return co_contact;
    }

    public void setCo_contact(String co_contact) {
        this.co_contact = co_contact;
    }

    public String getCo_address() {
        return co_address;
    }

    public void setCo_address(String co_address) {
        this.co_address = co_address;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }
    
    }

