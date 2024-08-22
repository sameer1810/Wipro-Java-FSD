package com.sam.lamda;


public class LambdaExpr {
public static void main(String[] args) {
		
		int w = 100;
		
		Drawable d = new Drawable()
		{
	    public void draw() {
			System.out.println("Drawing with width : " + w);
		  }
		};
		
	    d.draw();
	    
		
		Drawable d2 = () -> {
			System.out.println("Drawing : " + w);
		};
		d2.draw();
      }

}
