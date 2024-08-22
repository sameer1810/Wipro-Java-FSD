package com.sam.inheritpractice;

public class Box {
	
	private double length;
    private double width;
    private double height;

    // Constructor
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
 // Getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Method to calculate volume
    public double getVolume() {
        return length * width * height;
    }

}
