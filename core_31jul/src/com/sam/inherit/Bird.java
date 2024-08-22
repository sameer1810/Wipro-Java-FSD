package com.sam.inherit;

public class Bird extends Animal {

	String name;
	
	Bird(String name, int num){
		super(num);
		this.name = name;
	}
	
	public void identity() {
		System.out.println("I am "+ name+"no of legs: "+this.legs);
	}
	
	public void move() {
		System.out.println("I Dance");
	}
}
