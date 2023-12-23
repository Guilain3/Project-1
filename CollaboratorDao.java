
package Dao;

import Model.Collaborator;
import java.util.List;
import org.hibernate.Session;

public class CollaboratorDao {
    public Collaborator RegisterCollaborator (Collaborator colobj){
        try {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            ss.save(colobj);
            ss.beginTransaction().commit();
            ss.close();
            return colobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public Collaborator UpdateCollaborator (Collaborator colobj){
        try {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            ss.update(colobj);
            ss.beginTransaction().commit();
            ss.close();
            return colobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public Collaborator DeleteCollaborator(Collaborator colobj){
        try {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            ss.delete(colobj);
            ss.beginTransaction().commit();
            ss.close();
            return colobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public List<Collaborator> allCollaborator(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            List<Collaborator> colobj=ss.createQuery("select colobj from Collaborator colobj").list();                     
            ss.close();
            return colobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null; 
    }
    public Collaborator searchCollaboratorid(Collaborator colobj) {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Collaborator col=(Collaborator)ss.get(Collaborator.class,  colobj.getCo_id());
        ss.close();
        return col;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}

}
