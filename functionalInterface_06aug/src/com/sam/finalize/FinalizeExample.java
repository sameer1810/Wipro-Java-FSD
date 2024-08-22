package com.sam.finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		
		FinalizeExample obj = new FinalizeExample();
		
		System.out.println(obj);
		
		obj = null;
		
		System.gc();
		
		System.out.println("End of garbage collection");

	}
	
	@Override
	protected void finalize() {
		System.out.println("Finalize() called ");
	}
	

}
