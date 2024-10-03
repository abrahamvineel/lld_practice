package org.example;

public class ProductFactory {

    public static Product getProduct(ProductType type, String name, double price, int quantity) {
        switch (type) {
            case DRINK : return new Drink(name, price, quantity);
            case BISCUIT : return new Biscuit(name, price, quantity);
            case CHOCOLATE : return new Chocolate(name, price, quantity);
            default : throw new IllegalArgumentException("Product type not found");
        }
    }
}
