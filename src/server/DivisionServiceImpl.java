package server;

import shared.OperationService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DivisionServiceImpl extends UnicastRemoteObject implements OperationService {
    private final CalculatorState state;

    protected DivisionServiceImpl(CalculatorState state) throws RemoteException {
        super();
        this.state = state;
    }

    public double execute(double a) throws RemoteException {
        return state.updateValue(a, "divide");
    }
}