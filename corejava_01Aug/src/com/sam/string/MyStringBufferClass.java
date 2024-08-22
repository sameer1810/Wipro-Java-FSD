package com.sam.string;

public class MyStringBufferClass {
	public static void main(String[] args) {
		
		StringBuffer sbuf = new StringBuffer("Hello, everyone!!");
		
		char ch = sbuf.charAt(0);
		
		String str = sbuf.substring(7, 12);
		
		System.out.println("Buffer String : " + sbuf 
				     + "\nCharacter at index 0 : " 
				     + ch + "\nSub-string : "+ str);
	}

}
