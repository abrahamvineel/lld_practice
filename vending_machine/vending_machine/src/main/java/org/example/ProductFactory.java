package org.example;

public class ProductFactory {

    public static Product getProduct(String name) {
        switch (name) {
            case "drink" : return new Drink(name, 4.99, 2);
            case "biscuit" : return new Biscuit(name, 5.99, 3);
            case "chocolate" : return new Chocolate(name, 3.99, 4);
            default : throw new IllegalArgumentException("Product type not found");
        }
    }
}
