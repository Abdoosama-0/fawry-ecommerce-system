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
    //Ships a list of shippable items by printing their details and total weight.
    public void ship(List<Shippable> items) {
        System.out.println("** Shipment notice **");
        double totalWeight = 0;
        // Loop through each shippable item and print its name and weight
        for (Shippable item : items) {
            // Print: "1x [Product Name]    [Weight in grams]g"
            System.out.printf("1x %s\t\t%.0fg\n", item.getName(), item.getWeight() * 1000);
            totalWeight += item.getWeight();
        }
        // Print the total weight of the shipment in kilograms
        System.out.printf("Total package weight %.1fkg\n\n", totalWeight);
    }
}
