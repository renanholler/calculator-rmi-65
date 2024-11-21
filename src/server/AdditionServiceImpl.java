package server;

import shared.OperationService;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class AdditionServiceImpl extends UnicastRemoteObject implements OperationService {
    private final CalculatorState state;

    public AdditionServiceImpl(CalculatorState state) throws RemoteException {
        super();
        this.state = state;
    }

    @Override
    public double execute(double a) throws RemoteException {
        return state.updateValue(a, "add");
    }
}