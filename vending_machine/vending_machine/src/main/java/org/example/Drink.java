package org.example;

public class Drink extends Product{
    public Drink(String name, double price, int quantity) {
        super(name, price, ProductType.DRINK, quantity);
    }
}
