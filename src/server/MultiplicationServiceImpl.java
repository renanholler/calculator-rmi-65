package server;



import shared.OperationService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MultiplicationServiceImpl extends UnicastRemoteObject implements OperationService {
    private final CalculatorState state;

    protected MultiplicationServiceImpl(CalculatorState state) throws RemoteException {
        super();
        this.state = state;
    }

    @Override
    public double execute(double a) throws RemoteException {
        return state.updateValue(a, "multiply");
    }
}