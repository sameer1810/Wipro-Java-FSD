package com.grade;

public class NestedFor {

	public static void main(String[] args)
	{
		int i =1,j;
		int k=1;
		for(;i<=3;i++)
		{
			for(j=1;j<=6;j++)
			{
				System.out.print(" "+ k++);
			}
			System.out.println();
		}
		
	}
}
