package com.grade;

import java.io.*;

public class UserInput {

	public static void main(String[] args) throws IOException {
		// using BufferReader Class
		InputStreamReader systemInReader = new InputStreamReader(System.in);
		BufferedReader myBufReader = new BufferedReader(systemInReader);
		  
		System.out.println("Enter your name : " );
		
		String name = myBufReader.readLine() ;
		
		System.out.println("Enter your age : " );
		 
		 int age = Integer.parseInt(myBufReader.readLine());
		 
		 System.out.println("Name : " + name +"\n Age : " + age);
		 
		
  }
}