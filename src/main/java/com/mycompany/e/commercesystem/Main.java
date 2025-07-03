/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.e.commercesystem;

/**
 *
 * @author abdo
 */
import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        Product cheese = new PerishableProduct("Cheese", 100, 10, LocalDate.of(2025, 7, 5), 0.4);
        Product biscuits = new PerishableProduct("Biscuits", 150, 5, LocalDate.of(2025, 7, 10), 0.7);
        Product tv = new NonPerishableProduct("TV", 5000, 2, true, 10);
        Product scratchCard = new NonPerishableProduct("Scratch Card", 50, 10, false, 0);

        Customer customer = new Customer(1000);
        Cart cart = new Cart();

        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        cart.add(scratchCard, 1);

        CheckoutService checkoutService = new CheckoutService();
        checkoutService.checkout(customer, cart);
    }
}
