package org.example.vendingmachinestate;

import org.example.Product;

public class IdleState implements VendingMachineState {

    @Override
    public void insertMoney(VendingMachineContext context, double amount) {
        System.out.println("Please select the product");
    }

    @Override
    public void selectProduct(VendingMachineContext context, String product) {
        //set product
        //need to find how to get product type and price and quantity for the specified product
        //reduce the quantity of the product
        System.out.println("Thanks for selecting " + product + "Please pay ");
        context.setCurrentState(new AcceptingPaymentState());
    }

    @Override
    public void dispenseProduct(VendingMachineContext context) {
        System.out.println("Please select the product");
    }
}
