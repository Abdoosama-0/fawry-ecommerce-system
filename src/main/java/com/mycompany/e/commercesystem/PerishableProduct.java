/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e.commercesystem;

/**
 *
 * @author abdo
 */
import java.time.LocalDate;

/**
 * Represents a perishable product (e.g., Cheese, Biscuits)
 * that has an expiry date and requires shipping (i.e., has weight).
 */
public class PerishableProduct extends Product implements Shippable {
    // Expiry date of the product
    private LocalDate expiryDate;
    // Weight of the product in kilograms
    private double weight;

    // Constructor to initialize a perishable product.
    public PerishableProduct(String name, double price, int quantity, LocalDate expiryDate, double weight) {
        super(name, price, quantity); // Initialize the base Product attributes
        this.expiryDate = expiryDate;
        this.weight = weight;
    }
    //Checks if the product is expired by comparing today's date with the expiry date.
    @Override
    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }
    //Gets the weight of the product in kilograms .
    @Override
    public double getWeight() {
        return weight;
    }
}
