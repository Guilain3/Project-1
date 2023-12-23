
package Service;

import Model.Accounts;
import Model.Department;
import Model.Staff;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface DepartmentService extends Remote{
    Department recordDepartment(Department depobj) throws RemoteException;
    Department modifyDepartment(Department depobj) throws RemoteException;
    Department removeDepartment(Department depobj) throws  RemoteException;
    Department findaccountDepartment(Accounts acc) throws RemoteException;
    Department findstaffDepartment(Staff st) throws RemoteException;
    Department findnameDepartment(Department depobj) throws RemoteException;
    List<Department> Departmentall() throws RemoteException;
}
