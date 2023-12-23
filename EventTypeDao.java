
package Dao;


import Model.EventType;
import java.util.List;
import org.hibernate.Session;

public class EventTypeDao {
    public EventType RegisterEventType (EventType evtobj){
        try {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            ss.save(evtobj);
            ss.beginTransaction().commit();
            ss.close();
            return evtobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public EventType UpdateEventType (EventType evtobj){
        try {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            ss.update(evtobj);
            ss.beginTransaction().commit();
            ss.close();
            return evtobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public EventType DeleteEventType(EventType evtobj){
        try {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            ss.delete(evtobj);
            ss.beginTransaction().commit();
            ss.close();
            return evtobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public List<EventType> allEventType(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            List<EventType> evtobj=ss.createQuery("select evtobj from EventType evtobj").list();                     
            ss.close();
            return evtobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null; 
    }
    public EventType searchEventTypeName(EventType evtobj) {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        EventType evt=(EventType)ss.get(EventType.class,  evtobj.getType_name());
        ss.close();
        return evt;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
 public EventType searchEventTypeid(EventType evtobj) {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        EventType evt=(EventType)ss.get(EventType.class,  evtobj.getType_id());
        ss.close();
        return evt;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
 public EventType searchEventbytype(EventType evtobj) {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        EventType evt=(EventType)ss.get(EventType.class,  evtobj.getEvent());
        ss.close();
        return evt;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}

}
