package com.grayMatter;

public class ShoppingCartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i1 = new Item("Olive Oil 1l", 3, 100.0);
		 Item i2 = new Item("Cheese Slices", 2, 50.0);
		 Item i3 = new Item("Bread", 1, 75.0);
		 Item i4 = new Item("Eggs", 50, 10.0);
		 Item i5 = new Item("Chicken Salami", 2, 100.0);

		 ShoppingCart cart = new ShoppingCart();

	
		 cart.addToCart(i1);
		 cart.addToCart(i2);
		 cart.addToCart(i3);
		 cart.addToCart(i4);
		 cart.addToCart(i5); 

		 cart.showCart();
		 cart.removeFromCart(i3); 
		 cart.showCart(); 
		 double totalAmount = cart.getTotalAmount();
		 System.out.println(totalAmount); 

		 double payableAmount = cart.getPayableAmount();
		 System.out.println(payableAmount); 

		 cart.applyCoupon("IND50"); 

		 cart.printInvoice();
		 cart.applyCoupon("IND10"); 
		 
		 cart.printInvoice();
		 cart.addToCart(new Item("Milk", 5, 30.00)); 
		 cart.printInvoice();




	}

}
