package com.grade;

public class WhileLoopEg {
	
	public static void main(String[] args) {
		
		int i =1;
		while(i<6) {
			
			System.out.println("i= "+i++);
			
		}
		
		System.out.println("Outside loop i= "+i++);
	}
}
