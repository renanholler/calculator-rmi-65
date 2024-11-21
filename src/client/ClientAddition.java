package client;

import shared.OperationService;

import java.rmi.Naming;

public class ClientAddition {
    public static void main(String[] args) {
        try {
            String host = args.length > 0 ? args[0] : "server";
            OperationService additionService = (OperationService) Naming.lookup("rmi://" + host + ":2000/AdditionService");

            double result = additionService.execute(5.0);
            System.out.println("Updated Value (Addition): " + result);

        } catch (Exception e) {
            System.err.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
