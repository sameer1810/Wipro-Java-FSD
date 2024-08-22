package com.sam.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {

	public static void main(String[] args) {
		
       Pattern pattern = Pattern.compile(".aa.");
   
       Matcher matcher = pattern.matcher("MaaB");
       
       System.out.println("Input String Match : " + matcher.matches());
	}

}
