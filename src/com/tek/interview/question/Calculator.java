package com.tek.interview.question;


import java.util.Map;

/**
 * This class calculates tax depending on the type of goods in the cart , calculates the total item price
 * also calculates the grand total. 
 * 
 * @author nagarjunareddy
 *
 */
public class Calculator {
	/**
	 * receives a collection of orders. For each order, iterates on the order
	 * lines and calculate the total price which is the item's price * quantity
	 * * taxes.
	 * 
	 * For each order, print the total Sales Tax paid and Total price without
	 * taxes for this order
	 * 
	 * @param ordersMap
	 * @return grandTotal of orders
	 */
	public static double calculate(Map<String, Order> ordersMap) {

		double grandTotal = 0;

		// Iterate through the orders
		for (Map.Entry<String, Order> entry : ordersMap.entrySet()) {
			System.out.println("*******" + entry.getKey() + "*******");

			Order order = entry.getValue();
			System.out.println(order);
			grandTotal += order.getOrderTotal();
		}
		grandTotal = (Math.floor(grandTotal * 100) / 100);
		System.out.println("Sum of orders: " + grandTotal);
		return grandTotal;
	}

}
