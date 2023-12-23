
package Service.implementation ;

import Dao.CollaboratorDao;
import Model.Collaborator;
import Service.CollaboratorService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Guilaine
 */
public class CollaboratorServiceimp extends UnicastRemoteObject implements CollaboratorService{
    public CollaboratorServiceimp() throws RemoteException{
        
    }
    CollaboratorDao dao=new CollaboratorDao();
    @Override
    public Collaborator recordCollaborator(Collaborator colobj) throws RemoteException {
        return dao.RegisterCollaborator(colobj);
    }

    @Override
    public Collaborator modifyCollaborator(Collaborator colobj) throws RemoteException {
        return dao.UpdateCollaborator(colobj);
    }

    @Override
    public Collaborator removeCollaborator(Collaborator colobj) throws RemoteException {
        return dao.DeleteCollaborator(colobj);
    }

    @Override
    public Collaborator findidCollaborator(Collaborator colobj) throws RemoteException {
        return dao.searchCollaboratorid(colobj);
    }

    @Override
    public List<Collaborator> Collaboratorall() throws RemoteException {
        return dao.allCollaborator();
    }
    
}
