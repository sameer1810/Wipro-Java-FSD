package com.sam.string;

public class MyStringBuffer {
	public static void main(String[] args) {
		
		StringBuffer sbuffer = new StringBuffer(50);
		
		sbuffer.append("Hello, World.");
		
		sbuffer.replace(7, 12, "EveryOne!!");
		
		System.out.println(sbuffer + " len : " + sbuffer.length() + "\nCapacity : " + sbuffer.capacity());
	
	}

}
