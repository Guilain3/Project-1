
package Service;

import Model.EventType;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface EventTypeService extends Remote{
    EventType recordEventType(EventType evtobj) throws RemoteException;
    EventType modifyEventType(EventType evtobj) throws RemoteException;
    EventType removeEventType(EventType evtobj) throws  RemoteException;
    EventType findidEventType(EventType evtobj) throws RemoteException;
    EventType findnameEventType(EventType evtobj) throws RemoteException;
    EventType findeventbytype(EventType evtobj) throws RemoteException;
    List<EventType> EventTypeall() throws RemoteException;
}
