package com.sam.interfaces;

public interface Polygon {

	//abstract methods
	void area(int l, int b);
	void area(int r);
	double area(double r);
	void area(int x,int y,int z);
	
	default void saysomething() {
		
		System.out.println("I am Deafult Method");
	}
}
