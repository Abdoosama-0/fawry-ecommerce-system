/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e.commercesystem;

/**
 *
 * @author abdo
 */
/**
 * Represents a non-perishable product (e.g., TV, Mobile scratch card)
 * which may or may not require shipping.
 */
public class NonPerishableProduct extends Product {
    // Indicates whether this product needs shipping
    private boolean shippable;
    // Weight of the product in kilograms
    private double weight; 

    //Constructor to initialize a non-perishable product.
    public NonPerishableProduct(String name, double price, int quantity, boolean shippable, double weight) {
        super(name, price, quantity);// Initialize the base Product attributes
        this.shippable = shippable;
        this.weight = weight;
    }
    //Non-perishable products never expire.
    @Override
    public boolean isExpired() {
        return false; 
    }
    //Checks if the product needs to be shipped.
    public boolean isShippable() {
        return shippable;
    }
    //Gets the weight of the product in kilograms.
    public double getWeight() {
        return weight;
    }
}
