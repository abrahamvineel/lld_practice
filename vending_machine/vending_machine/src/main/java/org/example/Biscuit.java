package org.example;

public class Biscuit extends Product{
    public Biscuit(String name, double price, int quantity) {
        super(name, price, ProductType.BISCUIT, quantity);
    }
}
