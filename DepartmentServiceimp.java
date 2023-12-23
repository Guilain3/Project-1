
package Service.implementation;

import Dao.DepartmentDao;
import Model.Accounts;
import Model.Department;
import Model.Staff;
import Service.DepartmentService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class DepartmentServiceimp extends UnicastRemoteObject implements DepartmentService{
    public DepartmentServiceimp() throws RemoteException{
        
    }
    DepartmentDao dao=new DepartmentDao();
    @Override
    public Department recordDepartment(Department depobj) throws RemoteException {
       return dao.RegisterDepartment(depobj);
    }

    @Override
    public Department modifyDepartment(Department depobj) throws RemoteException {
        return dao.UpdateDepartment(depobj);
    }

    @Override
    public Department removeDepartment(Department depobj) throws RemoteException {
        return dao.DeleteDepartment(depobj);
    }

    @Override
    public Department findaccountDepartment(Accounts acc) throws RemoteException {
        return dao.searchDepartmentByAccount(acc);
    }

    @Override
    public Department findstaffDepartment(Staff st) throws RemoteException {
        return dao.searchDepartmentByStaff(st);
    }

    @Override
    public Department findnameDepartment(Department depobj) throws RemoteException {
        return dao.searchDepartmentname(depobj);
    }

    @Override
    public List<Department> Departmentall() throws RemoteException {
        return dao.allDepartment();
    } 
}
