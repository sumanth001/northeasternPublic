package edu.neu.csye6200;

public class ShoppingItem {
	private String itemName;
	private float itemPrice;
	private int numberOfItems;
	
	public ShoppingItem(String itemName, float itemPrice, int numberOfItems) {
		this.itemName=itemName;
		this.itemPrice=itemPrice;
		this.numberOfItems=numberOfItems;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	
	
}
