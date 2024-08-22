package com.sam.inherit;

public class Aquatic extends Animal {

	String name;
	
	public Aquatic(String name, int num) {
		super(num);
		this.name = name;
	}
	
	public void identity() {
		System.out.println("I am a "+name + " no of legs "+ this.legs);
	}
	
	public void move() {
		System.out.println("I swim ");
	}
	
	
}
