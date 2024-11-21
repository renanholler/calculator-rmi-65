package client;

import shared.OperationService;

import java.rmi.Naming;

public class ClientMultiply {
    public static void main(String[] args) {
        try {
            String host = args.length > 0 ? args[0] : "server";
            OperationService multiplyService = (OperationService) Naming.lookup("rmi://" + host + ":2000/MultiplyService");

            double result = multiplyService.execute(5.0);
            System.out.println("Updated Value (Multiply): " + result);

        } catch (Exception e) {
            System.err.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
