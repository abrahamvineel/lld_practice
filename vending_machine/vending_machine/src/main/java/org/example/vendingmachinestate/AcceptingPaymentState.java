package org.example.vendingmachinestate;

public class AcceptingPaymentState implements VendingMachineState{
    @Override
    public void insertMoney(VendingMachineContext context, double amount) {
        System.out.println("");
    }

    @Override
    public void selectProduct(VendingMachineContext context, String product) {
        System.out.println("Please select the product");
    }

    @Override
    public void dispenseProduct(VendingMachineContext context) {

    }
}
