package com.sam.lamda;



public class TwoParamClass {


	public static void main(String[] args) {
		TwoParamInterface tw = (x,y) -> {
			return (x+y);
		};
		
		System.out.println(tw.add(10,24));
		
	   }
	}

