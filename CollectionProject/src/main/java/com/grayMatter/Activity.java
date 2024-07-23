package com.grayMatter;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;


public class Activity {
//	private int item;
	private String itemName;
	private int nou;
	private int price;
	private String brand;
	public Activity( String itemName, int nou, int price, String brand) {
		super();
//		this.item = item;
		this.itemName = itemName;
		this.nou = nou;
		this.price = price;
		this.brand =brand;
	}
	public Activity() {
		super();
	}
//	public int getItem() {
//		return item;
//	}
//	public void setItem(int item) {
//		this.item = item;
//	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getNou() {
		return nou;
	}
	public void setNou(int nou) {
		this.nou = nou;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
	@Override
	public String toString() {
		return "Activity [itemName=" + itemName + ", nou=" + nou + ", price=" + price + ", brand=" + brand + "]";
	}
	public static void main(String[] args) {
		LinkedList<Activity> iList = new LinkedList<Activity>();

		Activity a1=new Activity("Car",20,999,"Koeinsegg");
		Activity a2 = new Activity("Bike", 20, 999, "Koeinsegg");
		Activity a3=new Activity("Airplane",20,999,"Boeing");
		Activity a4=new Activity("Tank",20,999,"Leopard");
		
		iList.add(a1);
		iList.add(a2);
		iList.add(a3);
		iList.add(a4);
		for(Activity i:iList)
			iList.sort(new ItemNameCompa().thenComparing(new BrandCompa()));
		
		for(Activity ae:iList)
			System.out.println(ae);
	}
	

		
	

}
