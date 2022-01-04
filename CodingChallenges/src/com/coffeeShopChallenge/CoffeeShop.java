package com.coffeeShopChallenge;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CoffeeShop {

	private String name;
	private  List<MenuItem> menu = new ArrayList<>();
	private Queue<String> orders = new ArrayDeque <String>();
	
	
	public CoffeeShop() {
		// TODO Auto-generated constructor stub
	}

	
	
	public CoffeeShop(String name, List<MenuItem> menu) {
		super();
		this.name = name;
		this.menu = menu;
	}



	public CoffeeShop(String name, List<MenuItem> menu, Queue<String> orders) {
		super();
		this.name = name;
		this.menu = menu;
		this.orders = orders;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<MenuItem> getMenu() {
		return menu;
	}


	public void setMenu(List<MenuItem> menu) {
		this.menu = menu;
	}


	public Queue<String> getOrders() {
		return orders;
	}


	public void setOrders(Queue<String> orders) {
		this.orders = orders;
	}


	public String addOrder(String orderName) {
	 if (findByItemName(orderName) != null) {
		orders.add(orderName);
		return "Order for " + orderName + " has been added.";
	 }
	 else 
		return "This item is currently unavailable.";

	}
	
	
	public MenuItem findByItemName (String orderName) {
		return menu.stream().filter(item -> orderName.equals(item.getItem())).findFirst().orElse(null);
		
	}
	
	public String fulfillOrder() {
		if (orders.peek() == null) {
			return "All orders have been fulfilled.";
		}else {
				String item = orders.poll();
				return "The order for " + item+ " is ready.";
			}
	}
	
	public String listOrders() {
		return orders.toString();	
	}
	
	public double dueAmount() {
		double total = 0.00;
		
		for (String order : orders) {
			MenuItem thing = menu.stream().filter(item -> order.equals(item.getItem())).findFirst().orElse(null);
			if (thing != null) {
			total += thing.getPrice();
			}
		}
		return total;
	}
	
	public String cheapestItem() {
		double minPrice = Integer.MAX_VALUE;
		String cheapItem = "";
		for (MenuItem m : menu) {
			if (m.getPrice() < minPrice) {
				minPrice = m.getPrice();
				cheapItem = m.getItem();
			}
		}
		return cheapItem;
	}
	
	public List<String> drinksOnly(){
		List<String> drinksList = new ArrayList<>();
		Object[] drinks =  (menu.stream().filter(item -> item.getType().equals("drink"))).toArray();
		for (Object drink: drinks) {
			drinksList.add(((MenuItem) drink).getItem());
		}
		return drinksList;
	}
	
	public List<String> foodOnly(){
		List<String> foodList = new ArrayList<>();
		Object[] foods = (menu.stream().filter(item -> item.getType().equals("food"))).toArray();
		for (Object food: foods) {
			foodList.add(((MenuItem) food).getItem());
		}
		return foodList;
	}
	
	
}
