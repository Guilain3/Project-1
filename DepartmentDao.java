
package Dao;

import Model.Accounts;
import Model.Department;
import Model.Staff;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class DepartmentDao {
    public Department RegisterDepartment (Department depobj){
        try {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            ss.save(depobj);
            ss.beginTransaction().commit();
            ss.close();
            return depobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public Department UpdateDepartment (Department depobj){
        try {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            ss.update(depobj);
            ss.beginTransaction().commit();
            ss.close();
            return depobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public Department DeleteDepartment(Department depobj){
        try {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            ss.delete(depobj);
            ss.beginTransaction().commit();
            ss.close();
            return depobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public List<Department> allDepartment(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            List<Department> depobj=ss.createQuery("select depobj from Department depobj").list();                     
            ss.close();
            return depobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null; 
    }
    public Department searchDepartmentname(Department depobj) {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Department dep=(Department)ss.get(Department.class,  depobj.getDep_name());
        ss.close();
        return dep;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
public Department searchDepartmentByAccount(Accounts acc) {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        String hql = "SELECT d FROM Department d JOIN d.accounts a WHERE a = :account";
        Query query = ss.createQuery(hql);
        query.setParameter("account", acc);
        Department department = (Department) query.uniqueResult();
        ss.close();
        return department;
    } catch (Exception ex) {
        ex.printStackTrace();
        throw new RuntimeException("Error in searching department by account", ex);
    }
}
public Department searchDepartmentByStaff(Staff st) {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
       String hql = "SELECT d FROM Department d JOIN d.staffs s WHERE s = :staf";
        Query query = ss.createQuery(hql);
        query.setParameter("staf", st);
        Department department = (Department) query.uniqueResult();
        ss.close();
        return department;
    } catch (Exception ex) {
        ex.printStackTrace();
        throw new RuntimeException("Error in searching department by account", ex);
    }
}


}
