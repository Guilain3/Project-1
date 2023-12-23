
package Dao;

import Model.Event;
import java.util.List;
import org.hibernate.Session;

public class EventDao {
    public Event RegisterEvent (Event evobj){
        try {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            ss.save(evobj);
            ss.beginTransaction().commit();
            ss.close();
            return evobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public Event UpdateEvent (Event evobj){
        try {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            ss.update(evobj);
            ss.beginTransaction().commit();
            ss.close();
            return evobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public Event DeleteEvent(Event evobj){
        try {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            ss.delete(evobj);
            ss.beginTransaction().commit();
            ss.close();
            return evobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public List<Event> allEvent(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            List<Event> evobj=ss.createQuery("select evobj from Event evobj").list();                     
            ss.close();
            return evobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null; 
    }
    public Event searchEventName(Event evobj) {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Event ev=(Event)ss.get(Event.class,  evobj.getEvent_name());
        ss.close();
        return ev;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
 public Event searchEventid(Event evobj) {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Event ev=(Event)ss.get(Event.class,  evobj.getEv_id());
        ss.close();
        return ev;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
}
