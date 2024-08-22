package com.sam.milestone1;

import java.util.LinkedList;

public class ShoppingCart {
    private LinkedList<String> cart;

    public ShoppingCart() {
        cart = new LinkedList<>();
    }

    public void addItem(String item) {
        cart.add(item);
    }

    public void removeItem(String item) {
    	 if (cart.contains(item)) {
             cart.remove(item);
             System.out.println("Item '" + item + "' removed from the cart.");
         } else {
             System.out.println("Item '" + item + "' not found in the cart.");
         }
    }

    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("SHOPPING CART IS EMPTY.");
        } else {
            System.out.println("SHOPPING CART: " + cart);
        }
    }

    public LinkedList<String> getCart() {
        return cart;
    }
    
    public void clearCart() {
        cart.clear();
        System.out.println("Shopping cart is now empty.");
    }

    public void setCart(LinkedList<String> newCart) {
        cart = new LinkedList<>(newCart); // Set the cart to a new list
    }
}
