package com.sam.inheritpractice;

public class ColoredBox extends Box {
	
	private String color;

    // Constructor
    public ColoredBox(double length, double width, double height, String color) {
        super(length, width, height);
        this.color = color;
    }

 // Getter for color
    public String getColor() {
        return color;
    }
}
