
package Service;

import Model.Collaborator;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface CollaboratorService extends Remote{
    Collaborator recordCollaborator(Collaborator colobj) throws RemoteException;
    Collaborator modifyCollaborator(Collaborator colobj) throws RemoteException;
    Collaborator removeCollaborator(Collaborator colobj) throws  RemoteException;
    Collaborator findidCollaborator(Collaborator colobj) throws RemoteException;
    List<Collaborator> Collaboratorall() throws RemoteException;
}
