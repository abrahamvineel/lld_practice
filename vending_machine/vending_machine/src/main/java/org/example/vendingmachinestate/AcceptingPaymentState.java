package org.example.vendingmachinestate;

import org.example.Product;

import java.util.Scanner;

public class AcceptingPaymentState implements VendingMachineState{
    @Override
    public void insertMoney(VendingMachineContext context) {
        System.out.println("Please insert the amount");

        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();

        Product product = context.getSelectedProduct();
        double diff = Math.abs(amount - product.getPrice());
        if (diff == 0.0) {
            System.out.println("Thanks for inserting the amount, Please collect the product in the tray");
        } else {
            System.out.println("Please collect the remaining amount " + diff);
        }
        VendingMachineState dispenseProductState = new DispenseProductState();
        context.setCurrentState(dispenseProductState);
        dispenseProductState.dispenseProduct(context);
    }

    @Override
    public void selectProduct(VendingMachineContext context) {
        System.out.println("Please insert the amount");
    }

    @Override
    public void dispenseProduct(VendingMachineContext context) {
        System.out.println("Please insert the amount");
    }
}
