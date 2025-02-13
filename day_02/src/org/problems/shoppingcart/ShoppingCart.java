package org.problems.shoppingcart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {
    private final HashMap<String, Double> productPrices;
    private final LinkedHashMap<String, Integer> cart;
    private final TreeMap<Double, String> sortedCart;

    public ShoppingCart() {
        productPrices = new HashMap<>();
        cart = new LinkedHashMap<>();
        sortedCart = new TreeMap<>();
    }

    public void addProduct(String name, double price) {
        productPrices.put(name, price);
    }
    public void addToCart(String name, int quantity) {
        if (productPrices.containsKey(name)) {
            cart.put(name, cart.getOrDefault(name, 0) + quantity);
            sortedCart.put(productPrices.get(name), name);
        } else {
            System.out.println("Product not found!");
        }
    }
    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " - Quantity: " + entry.getValue() + ", Price: " + productPrices.get(entry.getKey()));
        }
    }
    public void displaySortedCart() {
        System.out.println("Cart sorted by price:");
        for (Map.Entry<Double, String> entry : sortedCart.entrySet()) {
            System.out.println(entry.getValue() + " - Price: " + entry.getKey());
        }
    }
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("COla",56);
        cart.addProduct("DAl",82);
        cart.addProduct("Chips",36);

        cart.addToCart("COla",1);
        cart.addToCart("DAl",2);
        cart.addToCart("Chips",3);

        cart.displayCart();
        cart.displaySortedCart();
    }
}