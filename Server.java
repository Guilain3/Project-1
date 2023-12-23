
package Controller;

import Service.implementation.AccountServiceimp;
import Service.implementation.CollaboratorServiceimp;
import Service.implementation.DepartmentServiceimp;
import Service.implementation.EventServiceimp;
import Service.implementation.EventTypeServiceimp;
import Service.implementation.StaffServiceimp;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry theregistry=LocateRegistry.createRegistry(5000);
            theregistry.rebind("acc", new AccountServiceimp());
            theregistry.rebind("st", new StaffServiceimp());
            theregistry.rebind("ev", new EventServiceimp());
            theregistry.rebind("col", new CollaboratorServiceimp());
            theregistry.rebind("dep", new DepartmentServiceimp());
            theregistry.rebind("evt", new EventTypeServiceimp());
            System.out.println("Server is Running on port 5000");
            Thread.currentThread().join();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
