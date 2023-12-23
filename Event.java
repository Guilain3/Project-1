
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.*;

@Entity
public class Event implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ev_id;
    private String eventno;
    private String event_name;
    private Date event_date;
    @OneToOne
    @JoinColumn(name = "type_id")
    private EventType eventType;
    @ManyToMany
    @JoinTable(
    name="event_collaborator",
            joinColumns = @JoinColumn(name = "co_id"),
            inverseJoinColumns = @JoinColumn(name = "ev_id")
    )
    private Set<Collaborator> collaborators;

    public Event() {
    }

    public Event(Integer ev_id) {
        this.ev_id = ev_id;
    }

    public Event(Integer ev_id, String eventno, String event_name, Date event_date, EventType eventType, Set<Collaborator> collaborators) {
        this.ev_id = ev_id;
        this.eventno = eventno;
        this.event_name = event_name;
        this.event_date = event_date;
        this.eventType = eventType;
        this.collaborators = collaborators;
    }

    public Integer getEv_id() {
        return ev_id;
    }

    public void setEv_id(Integer ev_id) {
        this.ev_id = ev_id;
    }

    public String getEventno() {
        return eventno;
    }

    public void setEventno(String eventno) {
        this.eventno = eventno;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public Date getEvent_date() {
        return event_date;
    }

    public void setEvent_date(Date event_date) {
        this.event_date = event_date;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public Set<Collaborator> getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(Set<Collaborator> collaborators) {
        this.collaborators = collaborators;
    }
    
    
}
