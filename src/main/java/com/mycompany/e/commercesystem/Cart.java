/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e.commercesystem;

/**
 *
 * @author abdo
 */
import java.util.ArrayList;
import java.util.List;
/**
 * Represents a shopping cart that holds a list of selected items.
 * Allows adding items and retrieving cart contents.
 */
public class Cart {
    // List of items (products with quantities) in the cart
    private List<CartItem> items = new ArrayList<>();
    
    /**
     * Adds a product to the cart with a specific quantity.
     * Throws an exception if the requested quantity exceeds available stock.
     */
    public void add(Product product, int quantity) {
        if (quantity > product.getQuantity()) {
            throw new IllegalArgumentException("Not enough stock for " + product.getName());
        }
        items.add(new CartItem(product, quantity));
    }
    //Returns the list of all items in the cart.
    public List<CartItem> getItems() {
        return items;
    }
    //Checks whether the cart is empty.
    public boolean isEmpty() {
        return items.isEmpty();
    }
}

