
package Service.implementation;

import Dao.AccountDao;
import Model.Accounts;
import Service.AccountService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class AccountServiceimp extends UnicastRemoteObject implements AccountService{
   public AccountServiceimp() throws RemoteException{
       
   }
    AccountDao dao=new AccountDao();
    @Override
    public Accounts recordAccounts(Accounts accobj) throws RemoteException {
        return dao.RegisterAccount(accobj);
    }

    @Override
    public Accounts modifyAccounts(Accounts accobj) throws RemoteException {
        return dao.UpdateAccount(accobj);
    }

    @Override
    public Accounts removeAccounts(Accounts accobj) throws RemoteException {
        return dao.DeleteAccount(accobj);
    }

    @Override
    public Accounts findAccounts(Accounts accobj) throws RemoteException {
        return dao.searchAccounts(accobj);
    }

    @Override
    public List<Accounts> Accountsall() throws RemoteException {
        return dao.allAccounts();
    }
}
