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

public class ShippingService {
    public void ship(List<Shippable> items) {
        System.out.println("** Shipment notice **");
        double totalWeight = 0;

        for (Shippable item : items) {
            System.out.printf("1x %s\t\t%.0fg\n", item.getName(), item.getWeight() * 1000);
            totalWeight += item.getWeight();
        }

        System.out.printf("Total package weight %.1fkg\n\n", totalWeight);
    }
}
