package org.example.vendingmachinestate;

import org.example.Product;

public class VendingMachineContext {

    private VendingMachineState currentState;
    private double balance;
    private Product selectedProduct;

    public VendingMachineContext() {
        this.currentState = new IdleState();
        this.balance = 0;
        this.selectedProduct = null;
    }

    public VendingMachineState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(VendingMachineState currentState) {
        this.currentState = currentState;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }
}
