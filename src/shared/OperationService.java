package shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface OperationService extends Remote {
    double execute(double b) throws RemoteException;
}