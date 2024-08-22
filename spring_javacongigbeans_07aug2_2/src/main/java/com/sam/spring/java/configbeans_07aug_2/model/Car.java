package com.sam.spring.java.configbeans_07aug_2.model;

public class Car {

	private String name;
	private Engine engine;
	
	public Car() {
		
	}

	public Car(String name, Engine engine) {
		
		this.name = name;
		this.engine = engine;
	}
	
	public void show() {
		System.out.println("My car :"+ this.name+"My engine : "+this.engine);
	}
	
	
}
