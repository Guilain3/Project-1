
package Service.implementation;

import Dao.EventDao;
import Model.Event;
import Service.EventService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


public class EventServiceimp extends UnicastRemoteObject implements EventService{
    public EventServiceimp() throws RemoteException{
        
    }
    EventDao dao=new EventDao(); 
    @Override
    public Event recordEvent(Event evobj) throws RemoteException {
        return dao.RegisterEvent(evobj);
    }

    @Override
    public Event modifyEvent(Event evobj) throws RemoteException {
        return dao.UpdateEvent(evobj);
    }

    @Override
    public Event removeEvent(Event evobj) throws RemoteException {
        return dao.DeleteEvent(evobj);
    }

    @Override
    public Event findidEvent(Event evobj) throws RemoteException {
        return dao.searchEventid(evobj);
    }

    @Override
    public Event findnameEvent(Event evobj) throws RemoteException {
        return dao.searchEventName(evobj);
    }

    @Override
    public List<Event> Eventall() throws RemoteException {
        return dao.allEvent();
    }
}
