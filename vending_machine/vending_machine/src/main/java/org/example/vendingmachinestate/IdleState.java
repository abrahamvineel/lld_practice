package org.example.vendingmachinestate;

import org.example.Product;
import org.example.ProductFactory;
import java.util.Scanner;

public class IdleState implements VendingMachineState {

    @Override
    public void insertMoney(VendingMachineContext context) {
        System.out.println("Please select the product");
    }

    @Override
    public void selectProduct(VendingMachineContext context) {
        System.out.println("Please select the product");

        Scanner sc = new Scanner(System.in);
        String productName = sc.nextLine();

        Product prod = ProductFactory.getProduct(productName);
        context.setSelectedProduct(prod);

        System.out.println("Thanks for selecting " + productName + " Please pay " + prod.getPrice());

        VendingMachineState acceptingPaymentState = new AcceptingPaymentState();
        context.setCurrentState(acceptingPaymentState);
        acceptingPaymentState.insertMoney(context);
    }

    @Override
    public void dispenseProduct(VendingMachineContext context) {
        System.out.println("Please select the product");
    }
}
