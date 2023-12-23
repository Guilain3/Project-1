
package Service.implementation;

import Dao.StaffDao;
import Model.Staff;
import Service.StaffService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class StaffServiceimp extends UnicastRemoteObject implements StaffService{
    public StaffServiceimp() throws RemoteException{
        
    }
    StaffDao dao=new StaffDao();
    @Override
    public Staff recordStaff(Staff stobj) throws RemoteException {
        return dao.RegisterStaff(stobj);
    }

    @Override
    public Staff modifyStaff(Staff stobj) throws RemoteException {
        return dao.UpdateStaff(stobj);
    }

    @Override
    public Staff removeStaff(Staff stobj) throws RemoteException {
      return dao.DeleteStaff(stobj);
    }

    @Override
    public Staff findidStaff(Staff stobj) throws RemoteException {
        return dao.searchStaffId(stobj);
    }

    @Override
    public Staff findfnameStaff(Staff stobj) throws RemoteException {
        return dao.searchStaffFirstname(stobj);
    }

    @Override
    public Staff findlnameStaff(Staff stobj) throws RemoteException {
        return dao.searchStaffLastname(stobj);
    }

    @Override
    public Staff findageStaff(Staff stobj) throws RemoteException {
        return dao.searchStaffage(stobj);
    }

    @Override
    public List<Staff> Staffall() throws RemoteException {
        return dao.allStaff();
    }
        @Override
    public Staff findstaffdepartment(Staff stobj) throws RemoteException {
        return dao.searchStaffdepartment(stobj);
    }
        
    
}
