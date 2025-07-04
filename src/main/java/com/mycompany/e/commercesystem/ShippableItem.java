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
 * Represents a wrapper that combines a Shippable product with its quantity.
 * This is used during checkout to calculate total shipping weight and print accurate shipment details.
 */
public class ShippableItem {
    // The product that needs to be shipped (implements Shippable)
    private Shippable product;
    // The number of units of the product to be shipped
    private int quantity;
    
    //Constructor to initialize a ShippableItem with product and quantity.
    public ShippableItem(Shippable product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    //Returns the shippable product.
    public Shippable getProduct() {
        return product;
    }
    //Returns the quantity of the product to be shipped.
    public int getQuantity() {
        return quantity;
    }
}
