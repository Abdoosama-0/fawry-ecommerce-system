/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e.commercesystem;

/**
 *
 * @author abdo
 */
// Abstract base class representing a general product
public abstract class Product {
     // Common attributes for all products
    private String name; // Product name
    private double price; // Product price per unit
    private int quantity; // Available quantity in stock
    
// Constructor to initialize product attributes
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method to be implemented by subclasses
    // Determines if the product is expired (used for perishable items)
    public abstract boolean isExpired();

    // Returns the product name
    public String getName() {
        return name;
    }
    // Returns the product price
    public double getPrice() {
        return price;
    }
     // Returns the available quantity
    public int getQuantity() {
        return quantity;
    }
      // Reduces the available quantity by a given amount (after purchase)
    public void reduceQuantity(int amount) {
        this.quantity -= amount;
    }
}
