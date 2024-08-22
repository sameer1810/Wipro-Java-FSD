package com.sam.inherit;

public class InheritDemo {

	public static void main(String[] args) {
		
		Bird peacock = new Bird("Peacock",2);
		
		peacock.identity();
		peacock.move();
		
		Aquatic goldfish = new Aquatic("Gold Fish",0);
		
		goldfish.identity();
		goldfish.move();
		
	}
}
