
package Model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class EventType implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer type_id;
    private String type_name;
    @OneToOne(mappedBy = "eventType")
    private Event event;

    public EventType() {
    }

    public EventType(Integer type_id) {
        this.type_id = type_id;
    }

    public EventType(Integer type_id, String type_name, Event event) {
        this.type_id = type_id;
        this.type_name = type_name;
        this.event = event;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return type_name;
    }
    
}
