package com.sam.core31jul;

public class Box {

	private int length;
	private int width;
	private int height;
	
	//the below three constructor are example of constructor overloading 
		//generate constructor
		public Box(int length, int width, int height) {
			
			this.length = length;
			this.width = width;
			this.height = height;
		}
		
		//default constructor 
		public Box() {}
		
		//new constructor for cube, single parameter constructor 
			public Box(int x) {
				
				this.length = x;
				this.width = x;
				this.height = x;
			}
	
	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", height=" + height + "]";
	}
	
	int volume(){
		return length*width*height;
	}
	
	
	
		//setter method for length
		public void setLen(int l) {
			this.length = l;
		}
		
		//getter method for length
		public int getLen() {
			return this.length;
		}
		
		//setter method for width
		public void setWidth(int w) {
			this.width = w;
		}
		
		//getter method for width
		public int getWidth() {
			return this.width;
		}
		
		//setter method for hieght
		public void setHeight(int h) {
			this.height = h;
		}
		
		//getter method for length
		public int getHeight() {
			return this.height;
		}
}
