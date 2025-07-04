/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.e.commercesystem;

/**
 *
 * @author abdo
 */
import java.time.LocalDate;
/**
 * Entry point for the e-commerce simulation.
 * Creates sample products, customer, cart, and executes the checkout process.
 */
public class Main {

    public static void main(String[] args) {
        // Create perishable products with expiry dates and weights
        Product cheese = new PerishableProduct("Cheese", 100, 10, LocalDate.of(2025, 7, 5), 0.4);
        Product biscuits = new PerishableProduct("Biscuits", 150, 5, LocalDate.of(2025, 7, 10), 0.7);
        // Create a non-perishable product that requires shipping.
        Product tv = new NonPerishableProduct("TV", 5000, 2, true, 10);
        // Create a non-shippable non-perishable product (e.g., mobile scratch card)
        Product scratchCard = new NonPerishableProduct("Scratch Card", 50, 10, false, 0);
        // Create a customer with 1000 balance
        Customer customer = new Customer(1000);
        
        // Create a cart and add products to it
        Cart cart = new Cart();
        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        cart.add(scratchCard, 1);
        
        // Perform checkout process
        CheckoutService checkoutService = new CheckoutService();
        checkoutService.checkout(customer, cart);
    }
}
