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
 * Represents an item inside the shopping cart.
 * Associates a product with a specific quantity chosen by the customer.
 */
public class CartItem {
    // The product being added to the cart
    private Product product;
    // Quantity of this product in the cart
    private int quantity;

    // Constructor to initialize a cart item.
    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    //Returns the product associated with this cart item.
    public Product getProduct() {
        return product;
    }
    //Returns the quantity of the product in the cart.
    public int getQuantity() {
        return quantity;
    }
    //Calculates the total price for this cart item (price * quantity).
    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
}
