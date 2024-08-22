package com.grade;
import java.util.Scanner;
public class DoWhileEg {
	public static void main(String[] args) {
		
		int count=0;
		int choice;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			
			System.out.println("enter name");
			System.out.println("welcome"+ scanner.nextLine());
			count++;
			
			System.out.println("to enter more names, press 1 & press o to quit");
			choice = scanner.nextInt();
			scanner.nextLine();
			
		}while(choice!=0);
		
		System.out.println("you entere "+ count + "names ");
		
		scanner.close();
	}
}
