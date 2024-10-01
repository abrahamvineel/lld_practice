package org.example;

public class Chocolate extends Product{
    public Chocolate(String name, double price, int quantity) {
        super(name, price, ProductType.CHOCOLATE, quantity);
    }
}
