
package Service;

import Model.Accounts;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface AccountService extends Remote{
    Accounts recordAccounts(Accounts accobj) throws RemoteException;
    Accounts modifyAccounts(Accounts accobj) throws RemoteException;
    Accounts removeAccounts(Accounts accobj) throws  RemoteException;
    Accounts findAccounts(Accounts accobj) throws RemoteException;
    List<Accounts> Accountsall() throws RemoteException;
}
