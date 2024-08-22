package com.sam.lambda.item;

public class Item {
	 int id;
     String name;
     float price;
     
	public Item(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
     
	
     
}
