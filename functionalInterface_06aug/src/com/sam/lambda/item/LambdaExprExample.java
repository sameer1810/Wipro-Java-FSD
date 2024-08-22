package com.sam.lambda.item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExprExample {

	public static void main(String[] args) {
		
		List<Item> itemList = new ArrayList<Item>();
		
		itemList.add(new Item(1, "Dell Laptop", 80000f));
		itemList.add(new Item(2, "iphone Laptop", 91000f));
		itemList.add(new Item(3, "Dell keyboard", 5000f));
		itemList.add(new Item(4, "HP Laptop", 74000f));
		
		System.out.println("List of Items : ");
		
		for(Item i : itemList)
			System.out.println(i);
		
		Collections.sort(itemList, (i1, i2) -> {
			return i1.name.compareTo(i2.name);
		});
        System.out.println("List of Items after sorting : ");
		
		for(Item i : itemList)
			System.out.println(i);
		
		// filtering the item list using streams
		
		Stream<Item> filteredData =
				itemList.stream()
				         .filter(i -> i.price > 20000f );		
		System.out.println("List of Item costlier than 20000 : ");

		filteredData.forEach(i -> System.out.println(i.name + " " + i.price));
	
		System.gc();
		
		System.out.println("End of garbage collection");
		
	    }
	
	    @Override
		protected void finalize() {
			System.out.println("Finalize() called ");
		}
	}


