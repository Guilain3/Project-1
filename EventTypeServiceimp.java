
package Service.implementation;

import Dao.EventTypeDao;
import Model.EventType;
import Service.EventTypeService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class EventTypeServiceimp extends UnicastRemoteObject implements EventTypeService{
    public EventTypeServiceimp() throws RemoteException{
        
    }
    EventTypeDao dao=new EventTypeDao();
            
    @Override
    public EventType recordEventType(EventType evtobj) throws RemoteException {
        return dao.RegisterEventType(evtobj);
    }

    @Override
    public EventType modifyEventType(EventType evtobj) throws RemoteException {
return dao.UpdateEventType(evtobj);
    }

    @Override
    public EventType removeEventType(EventType evtobj) throws RemoteException {
return dao.DeleteEventType(evtobj);
    }

    @Override
    public EventType findidEventType(EventType evtobj) throws RemoteException {
return dao.searchEventTypeid(evtobj);
    }

    @Override
    public EventType findnameEventType(EventType evtobj) throws RemoteException {
return dao.searchEventTypeName(evtobj);
    }

    @Override
    public List<EventType> EventTypeall() throws RemoteException {
return dao.allEventType();
    }
    @Override
    public EventType findeventbytype(EventType evtobj) throws RemoteException {
return dao.searchEventbytype(evtobj);
    }
    
}
