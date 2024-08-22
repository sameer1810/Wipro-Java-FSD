package com.sam.spring.java.configbeans_07aug_2.model;

public class Engine {

	private String type;

	public Engine() {
	
	}
	public Engine(String type) {
		this.type = type;
		
	}
	
	public void status() {
		System.out.println("engine running : "+type);
	}
	
	@Override
	public String toString() {
		return "Engine [type=" + type + "]";
	}
	
}
