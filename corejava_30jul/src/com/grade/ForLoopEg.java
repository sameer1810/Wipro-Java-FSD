package com.grade;

import java.util.Scanner;

public class ForLoopEg {

	public static void main(String[] args)
	{
		String[] cities = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 cities");
		
		for(int i =0;i<5;i++) {
			cities[i]=sc.nextLine();
		}
		
		System.out.println("City name");
		
		for(int i =0;i<5;i++) {
			System.out.println((i+1)+" "+cities[i]);
		}
		
		//for each
		System.out.println("for each");
		for(String city:cities) {
			System.out.println(city);
		}
		
	}
	
}
