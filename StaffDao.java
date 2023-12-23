
package Dao;

import Model.Staff;
import java.util.List;
import org.hibernate.Session;

public class StaffDao {
    public Staff RegisterStaff (Staff stobj){
        try {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            ss.save(stobj);
            ss.beginTransaction().commit();
            ss.close();
            return stobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public Staff UpdateStaff (Staff stobj){
        try {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            ss.update(stobj);
            ss.beginTransaction().commit();
            ss.close();
            return stobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public Staff DeleteStaff(Staff stobj){
        try {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            ss.delete(stobj);
            ss.beginTransaction().commit();
            ss.close();
            return stobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public List<Staff> allStaff(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            List<Staff> stobj=ss.createQuery("select stobj from Staff stobj").list();                     
            ss.close();
            return stobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null; 
    }
    public Staff searchStaffId(Staff stobj) {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Staff st=(Staff)ss.get(Staff.class,  stobj.getStaffid());
        ss.close();
        return st;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
     public Staff searchStaffFirstname(Staff stobj) {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Staff st=(Staff)ss.get(Staff.class,  stobj.getFirstname());
        ss.close();
        return st;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
      public Staff searchStaffLastname(Staff stobj) {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Staff st=(Staff)ss.get(Staff.class,  stobj.getLastname());
        ss.close();
        return st;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
      public Staff searchStaffage(Staff stobj) {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Staff st=(Staff)ss.get(Staff.class,  stobj.getS_age());
        ss.close();
        return st;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
public Staff searchStaffdepartment(Staff stobj) {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Staff st=(Staff)ss.get(Staff.class,  stobj.getDepartments());
        ss.close();
        return st;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
}
