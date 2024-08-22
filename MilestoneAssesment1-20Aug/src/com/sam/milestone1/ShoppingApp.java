package com.sam.milestone1;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class ShoppingApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        PurchaseHistory history = new PurchaseHistory();
        CustomerService customerService = new CustomerService();
        Scanner scanner = new Scanner(System.in);
        int choice=0;

        do {
        	try {
            System.out.println("\nShopping App Menu:");
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. View cart");
            System.out.println("4. Save cart to Purchase");
            System.out.println("5. Undo last purchase");
            System.out.println("6. View purchase history");
            System.out.println("7. Add customer service request you want");
            System.out.println("8. Process Last customer service request");
            System.out.println("9. View pending customer service requests");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    String addItem = scanner.nextLine();
                    cart.addItem(addItem);
                    break;
                case 2:
                    System.out.print("Enter item to remove: ");
                    String removeItem = scanner.nextLine();
                    cart.removeItem(removeItem);
                    break;
                case 3:
                    cart.viewCart();
                    break;
                case 4:
                    history.saveCart(cart.getCart());
                    cart.clearCart();  // Clear the cart after saving
                    break;
                case 5:
                    LinkedList<String> lastCart = history.undoLastPurchase();
                    if (lastCart != null) {
                    	cart.setCart(lastCart); // Restore the last cart
                        System.out.println("Cart restored to previous state.");
                    }
                    break;
                case 6:
                    history.viewHistory();
                    break;
                case 7:
                    System.out.print("Enter the Customer Service Request you want: ");
                    String request = scanner.nextLine();
                    customerService.addRequest(request);
                    break;
                case 8:
                    customerService.processRequest();
                    break;
                case 9:
                    customerService.viewPendingRequests();
                    break;
                case 10:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        	 } catch (InputMismatchException e) {
                 System.out.println("Invalid input. Please enter a number between 1 and 10.");
                 scanner.nextLine(); // Consume the invalid input
             }
        } while (choice != 10);

        scanner.close();
    }
}
