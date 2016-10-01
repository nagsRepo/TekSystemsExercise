package com.tek.interview.question;


import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<OrderLine> orderLines = new ArrayList<OrderLine>();

	public Order() {
		super();
	}

	/**
	 * @param orderLine
	 * @throws Exception
	 */
	public void add(OrderLine orderLine) throws Exception {
		if (orderLine == null) {
			System.err.println("ERROR - Order is NULL");
			throw new IllegalArgumentException("Order is NULL");
		}
		orderLines.add(orderLine);
	}

	/**
	 * @return List of OrderLines
	 */
	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public int size() {
		return orderLines.size();
	}

	public OrderLine get(int i) {
		return orderLines.get(i);
	}

	/**
	 * @return sales tax
	 */
	public double getSalesTax(){
		Double totalTax =0.0;
		for (OrderLine orderLine : orderLines) {	
			totalTax += orderLine.getOrderLineTax();
		}
		return Math.ceil(totalTax * 100) / 100;
	}
	
	/**
	 * @return order total
	 */
	public double getOrderTotal(){
		Double totalPrice =0.0;
		for (OrderLine orderLine : orderLines) {	
			totalPrice += orderLine.getOrderLinePrice();
		}
		return Math.floor(totalPrice * 100) / 100;
	}
	
	public void clear() {
		this.orderLines.clear();
	}

	@Override
	public String toString() {
		String order = new String();
		for (OrderLine orderLine : orderLines) {
			order += orderLine;
		}
		order += "Sales Tax: " + getSalesTax() + "\n" +"Total: "+getOrderTotal();
		return order;
	}
	
	
}
