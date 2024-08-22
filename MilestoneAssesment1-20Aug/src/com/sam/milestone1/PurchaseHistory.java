package com.sam.milestone1;

import java.util.LinkedList;
import java.util.Stack;

public class PurchaseHistory {
    private Stack<LinkedList<String>> history;

    public PurchaseHistory() {
        history = new Stack<>();
    }

    public void saveCart(LinkedList<String> cart) {
        history.push(new LinkedList<>(cart));
        System.out.println("CART SAVED TO PURCHASE HISTORY.");
    }

    public LinkedList<String> undoLastPurchase() {
        if (!history.isEmpty()) {
            System.out.println("LAST PURCHASE UNDONE.");
            return history.pop();
        }
        System.out.println("NO PURCHASE HISTORY TO UNDO..");
        return null;
    }

    public void viewHistory() {
        if (history.isEmpty()) {
            System.out.println("NO PURCHASE HISTORY.");
        } else {
            System.out.println("PURCHASE HISTORY.: " + history);
        }
    }
}
