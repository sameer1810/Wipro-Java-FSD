package com.sam.lamda;



public class LambdaExprWithParameter {
public static void main(String[] args) {
		
		WelcomeInterface s1 = (name) -> {
			return "Hello " + name;
		};
		
		System.out.println(s1.say("Likhii"));
	}

}
