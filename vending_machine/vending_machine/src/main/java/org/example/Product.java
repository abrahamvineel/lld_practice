package org.example;

public class Product {

    private final String name;
    private final double price;
    private final ProductType type;
    private final int quantity;

    public Product(String name, double price, ProductType type, int quantity) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.quantity = quantity;
    }
}
