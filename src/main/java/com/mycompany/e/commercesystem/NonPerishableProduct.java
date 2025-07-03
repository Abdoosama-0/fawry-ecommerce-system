/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e.commercesystem;

/**
 *
 * @author abdo
 */
public class NonPerishableProduct extends Product {
    private boolean shippable;
    private double weight; // فقط لو shippable

    public NonPerishableProduct(String name, double price, int quantity, boolean shippable, double weight) {
        super(name, price, quantity);
        this.shippable = shippable;
        this.weight = weight;
    }

    @Override
    public boolean isExpired() {
        return false; // Non-perishable
    }

    public boolean isShippable() {
        return shippable;
    }

    public double getWeight() {
        return weight;
    }
}
