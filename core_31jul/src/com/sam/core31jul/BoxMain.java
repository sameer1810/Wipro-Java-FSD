package com.sam.core31jul;

//not importing Box Class because they are in the same package

public class BoxMain {

	public static void main(String[] args) {
		
		Box b1;
		b1= new Box();
		
		b1.setHeight(5);
		b1.setLen(4);
		b1.setWidth(2);
		
		System.out.println("My New Box H: " + b1.getHeight()+"L: "+b1.getLen()+"W: "+b1.getWidth());
		
		//using constructor
		Box b2 = new Box(4,5,6);
		
		System.out.println("BOX 2 : "+ b2);
		
		//volume
		System.out.println("BOX 2 : "+ b2+ " Volume: "+ b2.volume());
		
		// if l==b==h
		//create new constructor
		Box b3 = new Box(6);
		System.out.println("BOX 2 : "+ b3+ " Volume: "+ b3.volume());
		
	}
}
