package server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class MainServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(2000);

            CalculatorState state = new CalculatorState();

            Naming.rebind("rmi://0.0.0.0:2000/AdditionService", new AdditionServiceImpl(state));
            Naming.rebind("rmi://0.0.0.0:2000/SubtractionService", new SubtractionServiceImpl(state));
            Naming.rebind("rmi://0.0.0.0:2000/MultiplyService", new MultiplicationServiceImpl(state));
            Naming.rebind("rmi://0.0.0.0:2000/DivisionService", new DivisionServiceImpl(state));

            System.out.println("Main Server is ready.");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}