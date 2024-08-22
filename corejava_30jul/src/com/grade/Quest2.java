package com.grade;

public class Quest2 {
	
	public static void main(String[] args){
		
		int i=1;
		
		int k = 1;
		
		for(;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" "+k++);
			}
			
			System.out.println();
		}
	}

}
