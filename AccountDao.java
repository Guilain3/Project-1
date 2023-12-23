
package Dao;

import Model.Accounts;
import java.util.List;
import org.hibernate.Session;

public class AccountDao {
    public Accounts RegisterAccount (Accounts accobj){
        try {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            ss.save(accobj);
            ss.beginTransaction().commit();
            ss.close();
            return accobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public Accounts UpdateAccount (Accounts accobj){
        try {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            ss.update(accobj);
            ss.beginTransaction().commit();
            ss.close();
            return accobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public Accounts DeleteAccount(Accounts accobj){
        try {
            Session ss= HibernateUtil.getSessionFactory().openSession();
            ss.delete(accobj);
            ss.beginTransaction().commit();
            ss.close();
            return accobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    

    public List<Accounts> allAccounts(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            List<Accounts> accobj=ss.createQuery("select accobj from Accounts accobj").list();                     
            ss.close();
            return accobj;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null; 
    }

    

    public Accounts searchAccounts(Accounts accobj) {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Accounts acc = (Accounts) ss.get(Accounts.class, accobj.getId());
        ss.close();

        // Check if the account exists and the passwords match
        if (acc != null && acc.getPassword().equals(accobj.getPassword())) {
            return acc; // Authentication successful
        } else {
            return null; // Authentication failed
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}


}
