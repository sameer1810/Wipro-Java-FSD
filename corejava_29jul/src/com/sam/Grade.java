import java.util.*;

package com.sam;

public class Grade {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.println("You entered: " + inputString);

        // Read an integer
        System.out.print("Enter an integer: ");
        int inputInt = scanner.nextInt();
        System.out.println("You entered: " + inputInt);

        // Read a double
        System.out.print("Enter a double: ");
        double inputDouble = scanner.nextDouble();
        System.out.println("You entered: " + inputDouble);

        // Read a boolean
        System.out.print("Enter a boolean: ");
        boolean inputBoolean = scanner.nextBoolean();
        System.out.println("You entered: " + inputBoolean);

        // Close the scanner
        scanner.close();
    }
}

