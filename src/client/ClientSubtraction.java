package client;

import shared.OperationService;

import java.rmi.Naming;

public class ClientSubtraction {
    public static void main(String[] args) {
        try {
            String host = args.length > 0 ? args[0] : "server";
            OperationService subtractionService = (OperationService) Naming.lookup("rmi://" + host + ":2000/SubtractionService");

            double result = subtractionService.execute(2.0);
            System.out.println("Updated Value (Subtraction): " + result);

        } catch (Exception e) {
            System.err.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
