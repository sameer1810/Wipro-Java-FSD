package com.grade;
import java.util.Scanner;

public class Quest4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();
        
        //part 1
        for (int i = 1; i <= n; i++) {
            
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
     // Part 2
        for (int i = n - 1; i >= 1; i--) {
            
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}
}
