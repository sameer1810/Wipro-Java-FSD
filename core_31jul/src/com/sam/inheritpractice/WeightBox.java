package com.sam.inheritpractice;

public class WeightBox extends ColoredBox {

	private double density;

    // Constructor
    public WeightBox(double length, double width, double height, String color, double density) {
        super(length, width, height, color);
        this.density = density;
    }
    
    // Getter for density
    public double getDensity() {
        return density;
    }
    
    // Method to calculate the mass of the box
    public double getMass() {
        return getDensity() * getVolume();
    }
    
    public static void main(String[] args) {
       WeightBox box = new WeightBox(2.0, 3.0, 4.0, "Red", 5.0);
        System.out.println("Color: " + box.getColor());//can use tostring method
        System.out.println("Density: " + box.getDensity());
        System.out.println("Volume: " + box.getVolume());
        System.out.println("Mass: " + box.getMass());
    }
}
