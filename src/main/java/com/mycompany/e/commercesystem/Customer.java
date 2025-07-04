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
 * Represents a customer using the e-commerce system.
 * Each customer has a balance used for purchases.
 */
public class Customer {
     // Current balance available in the customer's account
    private double balance;
    //Constructor to initialize customer with a starting balance.
    public Customer(double balance) {
        this.balance = balance;
    }
    //Gets the current balance of the customer.
    public double getBalance() {
        return balance;
    }
    //Deducts an amount from the customer's balance after checkout.
    public void deduct(double amount) {
        balance -= amount;
    }
}

