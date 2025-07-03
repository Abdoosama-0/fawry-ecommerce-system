# 🛒 Fawry Quantum Internship Challenge – E-Commerce System

A simple Object-Oriented Java project that simulates an e-commerce system supporting perishable and non-perishable products, shipping logic, cart management, and checkout process, built as part of the Fawry Rise Internship Challenge.

---

## 📦 Features

- Define products with:
  - `name`, `price`, `quantity`
  - Expiration handling (for perishable items like Cheese & Biscuits)
  - Shipping requirement (with weight for shippable items)
  
- Cart functionality:
  - Add items to cart with specific quantity
  - Validates available stock before adding

- Checkout process:
  - Calculates subtotal, shipping fee, total amount
  - Validates:
    - Cart not empty
    - Products not expired or out of stock
    - Customer has sufficient balance
  - Updates customer balance
  - Triggers shipping service for shippable items

- Polymorphic shipping system:
  - Accepts `Shippable` interface containing:
    - `getName()`
    - `getWeight()`

---

## 🧩 Class Structure

| Class / Interface      | Description |
|------------------------|-------------|
| `Product` *(abstract)* | Base class for all products |
| `PerishableProduct`    | Extends `Product`, implements `Shippable`, handles expiry |
| `NonPerishableProduct` | Extends `Product`, may or may not be shippable |
| `Shippable` *(interface)* | Declares required shipping methods |
| `CartItem`             | Represents an item + quantity in cart |
| `Cart`                 | Holds list of cart items with add logic |
| `Customer`             | Holds user balance |
| `ShippingService`      | Prints shipping details for all shippable items |
| `CheckoutService`      | Manages full checkout and validation process |
| `Main`                 | Demo to test all use cases |

---

## 📌 Example Use Case

```java
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
```
---

## 🖨️ Sample Console Output
```
** Shipment notice **
1x Cheese        400g
1x Biscuits      700g
Total package weight 1.1kg

** Checkout receipt **
2x Cheese        200
1x Biscuits      150
1x Scratch Card   50
----------------------
Subtotal          400
Shipping           30
Amount             430
Remaining Balance  570
```
