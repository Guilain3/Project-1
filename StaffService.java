
package Service;

import Model.Staff;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface StaffService extends Remote{
    Staff recordStaff(Staff stobj) throws RemoteException;
    Staff modifyStaff(Staff stobj) throws RemoteException;
    Staff removeStaff(Staff stobj) throws  RemoteException;
    Staff findidStaff(Staff stobj) throws RemoteException;
    Staff findfnameStaff(Staff stobj) throws RemoteException;
    Staff findlnameStaff(Staff stobj) throws RemoteException;
    Staff findageStaff(Staff stobj) throws RemoteException;
    Staff findstaffdepartment(Staff stobj) throws RemoteException;
    List<Staff> Staffall() throws RemoteException;
}
