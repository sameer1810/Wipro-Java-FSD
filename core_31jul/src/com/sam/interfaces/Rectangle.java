package com.sam.interfaces;

public class Rectangle implements Polygon {

	@Override
	public void area(int l, int b) {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle: "+ l*b);

	}

	@Override
	public void area(int r) {
		// TODO Auto-generated method stub
		System.out.println("Area of square: "+ r*r);
	}

	@Override
	public void area(int x, int y, int z) {
		// TODO Auto-generated method stub

	}
	
	public double area(double r) {
		// TODO Auto-generated method stub
		return (22/7)*r*r;
	}

}
