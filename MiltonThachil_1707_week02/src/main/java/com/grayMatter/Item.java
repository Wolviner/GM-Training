package com.grayMatter;

public class Item implements Comparable<Item> {
    private String productName;
    private int quantity;
    private double unitPrice;

   
    public Item() {
		super();
	}


	public Item(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

   
    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    public String toString() {
        return productName + " " + quantity + " " +  String.format("%.2f", unitPrice) + " " + String.format("%.2f",getTotalPrice());
    }

    public double getTotalPrice() {
        return quantity * unitPrice;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true; 
        }
        if (o == null || getClass() != o.getClass()) {
            return false; 
        }

        Item i = (Item) o; 
        return this.getProductName().equals(i.getProductName());
    }


	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

