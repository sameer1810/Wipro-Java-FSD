package com.grade;

import java.util.Scanner;

public class UserInputScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Use of Scanner class : ");
		System.out.println("Enter your name : ");
		
		String name = sc.nextLine();
		
		System.out.println("Enter your age");
		
		int age = sc.nextInt();
		
		System.out.println("Enter your marks : ");
		
		float marks = sc.nextFloat();
		
		System.out.println("Name : " + name +"\n Age : " + age +"\n Marks : " + marks);
}
}
