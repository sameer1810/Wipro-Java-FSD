package com.sam.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("xy", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("XYzwxyXZ");
	    
		while (matcher.find()) {
			
			System.out.println("Found the text \"" + matcher.group() 
			+"\" Starting at " + matcher.start()
			+ " index abd ending at index " + matcher.end());
		}
		
		//split()
        pattern = Pattern.compile("\\W");
        String[] fruits = pattern.split("apple@Banana$cherry#dates$kiwi");		
	    
        for (String f : fruits ) {
        	System.out.println("Split using Pattern.split() : " + f);
        }
        
        pattern = Pattern.compile("\\W");
        String[] flowers = pattern.split("jasmine@lilly#rose");
        
        for (String f : flowers) {
        	System.out.println("Split using Pattern.split() : " + f);
        }
        
	}
	

}
