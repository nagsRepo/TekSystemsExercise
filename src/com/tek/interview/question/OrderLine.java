package com.tek.interview.question;


public class OrderLine {
	private int quantity;
	private Item item;

	public OrderLine() {
		super();
	}

	/*
	 * @param item Item of the order
	 * 
	 * @param quantity Quantity of the item
	 */
	public OrderLine(Item item, int quantity) throws Exception {
		if (item == null) {
			System.err.println("ERROR - Item is NULL");
			throw new Exception("Item is NULL");
		}
		assert quantity > 0;
		this.item = item;
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public Item getItem() {
		return item;
	}

	/**
	 * @return Order line price
	 */
	public double getOrderLinePrice(){		
		return ((double) (item.getPrice() * quantity * 100)) / 100;
	}
	
	/**
	 * @return order line tax
	 */
	public double getOrderLineTax(){
		return ((double) (item.getTax() * quantity * 100)) / 100;
	}
	
	/**
	 * @return orderline price with tax
	 */
	private	double getOrderLinePriceWithTax(){
		return Math.ceil((item.getPrice() + item.getTax() )* quantity* 100) / 100;
	}
	
	@Override
	public String toString() {
		return  quantity + " " + item.getDescription() + " " +  getOrderLinePriceWithTax() +"\n";
	}

	

}
