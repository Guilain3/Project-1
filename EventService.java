
package Service;

import Model.Event;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface EventService extends Remote{
    Event recordEvent(Event evobj) throws RemoteException;
    Event modifyEvent(Event evobj) throws RemoteException;
    Event removeEvent(Event evobj) throws  RemoteException;
    Event findidEvent(Event evobj) throws RemoteException;
    Event findnameEvent(Event evobj) throws RemoteException;
    List<Event> Eventall() throws RemoteException;
}
