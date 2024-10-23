package org.example.vendingmachinestate;

public interface VendingMachineState {
    void insertMoney(VendingMachineContext context);
    void selectProduct(VendingMachineContext context);
    void dispenseProduct(VendingMachineContext context);
}
