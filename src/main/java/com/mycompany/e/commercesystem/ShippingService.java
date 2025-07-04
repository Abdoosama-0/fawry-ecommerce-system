/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e.commercesystem;

/**
 *
 * @author abdo
 */
import java.util.List;
/**
 * Handles the shipping process by printing a shipping notice
 * for all items that need to be shipped.
 */
public class ShippingService {
    //Prints shipping information for each item including name, quantity, and total weight.
    // Also calculates and prints the total shipment weight.
    public void ship(List<ShippableItem> items) {
        System.out.println("** Shipment notice **");
        double totalWeight = 0;// total weight of the entire shipment (in kg)
 
        for (ShippableItem item : items) {
            Shippable product = item.getProduct();
            int quantity = item.getQuantity();
            double weight = product.getWeight() * quantity;
            // Print: "[quantity]x [product name]    [total weight in grams]g"
            System.out.printf("%dx %s\t\t%.0fg\n", quantity, product.getName(), weight * 1000);

            totalWeight += weight;
        }
         // Print final total shipment weight in kilograms
        System.out.printf("Total package weight %.1fkg\n\n", totalWeight);
    }
}

