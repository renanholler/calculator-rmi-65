package client;

import shared.OperationService;

import java.rmi.Naming;

public class ClientDivision {
    public static void main(String[] args) {
        try {
            String host = args.length > 0 ? args[0] : "server";
            shared.OperationService divisionService = (OperationService) Naming.lookup("rmi://" + host + ":2000/DivisionService");

            double result = divisionService.execute(5.0);
            System.out.println("Updated Value (Division): " + result);

        } catch (Exception e) {
            System.err.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
