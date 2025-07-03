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

public class CheckoutService {
    public void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            throw new IllegalStateException("Cart is empty.");
        }

        List<Shippable> toShip = new ArrayList<>();
        double subtotal = 0;

        for (CartItem item : cart.getItems()) {
            Product p = item.getProduct();

            if (p.isExpired()) {
                throw new IllegalStateException(p.getName() + " is expired.");
            }

            if (item.getQuantity() > p.getQuantity()) {
                throw new IllegalStateException(p.getName() + " out of stock.");
            }

            p.reduceQuantity(item.getQuantity());
            subtotal += item.getTotalPrice();

            if (p instanceof Shippable) {
                toShip.add((Shippable) p);
            } else if (p instanceof NonPerishableProduct) {
                NonPerishableProduct np = (NonPerishableProduct) p;
                if (np.isShippable()) {
                    toShip.add(new Shippable() {
                        public String getName() { return np.getName(); }
                        public double getWeight() { return np.getWeight(); }
                    });
                }
            }
        }

        double shipping = toShip.isEmpty() ? 0 : 30;
        double total = subtotal + shipping;

        if (customer.getBalance() < total) {
            throw new IllegalStateException("Insufficient balance.");
        }

        customer.deduct(total);

        if (!toShip.isEmpty()) {
            new ShippingService().ship(toShip);
        }

        // Print receipt
        System.out.println("** Checkout receipt **");
        for (CartItem item : cart.getItems()) {
            System.out.printf("%dx %s\t\t%.0f\n", item.getQuantity(), item.getProduct().getName(), item.getTotalPrice());
        }
        System.out.println("----------------------");
        System.out.printf("Subtotal\t\t%.0f\n", subtotal);
        System.out.printf("Shipping\t\t%.0f\n", shipping);
        System.out.printf("Amount\t\t\t%.0f\n", total);
        System.out.printf("Remaining Balance\t%.0f\n", customer.getBalance());
    }
}
