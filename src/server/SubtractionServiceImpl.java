package server;


import shared.OperationService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SubtractionServiceImpl extends UnicastRemoteObject implements OperationService {
    private final CalculatorState state;

    protected SubtractionServiceImpl(CalculatorState state) throws RemoteException {
        super();
        this.state = state;
    }

    @Override
    public synchronized double execute(double a) throws RemoteException {
        return state.updateValue(a, "subtract");
    }
}