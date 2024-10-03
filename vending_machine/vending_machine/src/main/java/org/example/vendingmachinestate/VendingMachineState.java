package org.example.vendingmachinestate;

public interface VendingMachineState {
    void insertMoney(VendingMachineContext context, double amount);
    void selectProduct(VendingMachineContext context, String product);
    void dispenseProduct(VendingMachineContext context);
}
