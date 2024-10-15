package org.example.vendingmachinestate;

public class DispenseProductState implements VendingMachineState{

    @Override
    public void insertMoney(VendingMachineContext context, double amount) {
        System.out.println("Please collect the product");
    }

    @Override
    public void selectProduct(VendingMachineContext context, String product) {
        System.out.println("Please collect the product");
    }

    @Override
    public void dispenseProduct(VendingMachineContext context) {
        int quantity = context.getSelectedProduct().getQuantity();
        quantity--;
        context.getSelectedProduct().setQuantity(quantity);

        System.out.println("Please collect the product");
    }
}
