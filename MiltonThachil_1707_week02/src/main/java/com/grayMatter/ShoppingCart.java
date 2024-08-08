package com.grayMatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class ShoppingCart {
    private ArrayList<Item> items;
    private double discount;

    public ShoppingCart() {
        items = new ArrayList<>();
        discount = 0.0;
    }

    public void addToCart(Item item) {
        items.add(item);
    }

    public void removeFromCart(Item item) {
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item i = iterator.next();
            if (i.equals(item)) {  
                iterator.remove(); 
                break; 
            }
        }
    }


    
    public void showCart() {
        items.forEach(item -> System.out.println(item.getProductName() + ": " + item.getQuantity()));
        System.out.println("\n\n");
    }

    
    public double getTotalAmount() {
        return items.stream().mapToDouble(item->item.getTotalPrice()).sum();
    }

    
    public void applyCoupon(String coupon) {

        Function<String,Double> disc=i->{
        	if("IND10".equals(i)) {
        		return discount = 0.10;
        	}
        	else {
                return discount = 0.0;
            }
        };
        this.discount = disc.apply(coupon);
        
    }

    public double getPayableAmount() {
        double totalAmount = getTotalAmount();
        double discountAmount = totalAmount * discount;
        double tax = (totalAmount-discountAmount) * 0.14;
       
        return totalAmount - discountAmount + tax;
    }

    
    public void printInvoice() {

        items.forEach(i->System.out.println(i));
        System.out.println("\n");
        double totalAmount = getTotalAmount();
        double discountAmount = totalAmount * discount;
        double tax = (totalAmount-discountAmount) * 0.14;
        double payableAmount = getPayableAmount();

        
        System.out.printf("Total: %.2f%n" , totalAmount);
        System.out.printf("Disc%%: %.2f%n" , discountAmount);
        System.out.printf("Tax: %.2f%n" , tax);
        System.out.printf("Total: %.2f%n" , payableAmount);
        
        System.out.println("\n\n");
    }
}
