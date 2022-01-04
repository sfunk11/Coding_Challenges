package com.coffeeShopChallenge;

import java.util.ArrayList;
import java.util.List;

public class CoffeeDriver {

	//Instantiating initial CoffeeShop
	public static CoffeeShop initializeData() {
		List<MenuItem> menu = new ArrayList<>();
		menu.add(new MenuItem ("Cafe Latte", "drink", 5.25));
		menu.add(new MenuItem("Drip Coffee", "drink", 2.25));
		menu.add(new MenuItem("Espresso", "drink", 3.25));
		menu.add( new MenuItem("Cafe Mocha", "drink", 5.25));
		menu.add(new MenuItem("Muffin", "food", 2.75));
		menu.add( new MenuItem("Sandwich", "food", 6.75));
		menu.add( new MenuItem("Cookie", "food", 2.50));
		
		
		 return new CoffeeShop("Sam's Coffee House", menu);
		
		
	}
	
	public static void main(String[] args) {
		CoffeeShop shop = initializeData();
		
		//prints cheapest item, should be a drip coffee
		System.out.println("Cheapest Item: " + shop.cheapestItem() );
		
		//prints the drinks only
		System.out.println("Drinks: " + shop.drinksOnly().toString());
			
		//prints the foods only
		System.out.println("Foods: " + shop.foodOnly().toString());
		
		//Prints orders (should be empty right now)
		System.out.println("Current orders: "+shop.listOrders());
		
		//Adds some orders
		System.out.println(shop.addOrder("Sandwich"));
		System.out.println(shop.addOrder("Cafe Mocha"));
		
		//print orders and total price
		System.out.println("Current Orders: " + shop.listOrders() );
		System.out.println("Total due: $" + shop.dueAmount());
		
		//fufill the orders
		for (String order: shop.getOrders()) {
			System.out.println(shop.fulfillOrder());
		}
		System.out.println(shop.fulfillOrder());
		

	}

}
