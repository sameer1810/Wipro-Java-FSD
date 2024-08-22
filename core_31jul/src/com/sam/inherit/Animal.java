package com.sam.inherit;

public class Animal {
	
	int legs;
		
	Animal(int num){
		this.legs = num;
	}
	
	public void legs() {
		System.out.println("NO of legs: "+legs);
	}
	public void move() {
		System.out.println("I Move");
	}
	
	public void speak() {
		System.out.println("I speak");
	}
	
	
}
