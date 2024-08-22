package com.sam.string;

public class MyStringBuilder {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Weather is awesome");
		
		sb.repeat(2, 3);
	
		sb.insert(0, "Today");
		
	    System.out.println(sb);
	   
	    sb.ensureCapacity(50);
		
	    System.out.println(sb.capacity());	
	    
	}

}

