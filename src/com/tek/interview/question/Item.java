package com.tek.interview.question;


public class Item {
	private String description;
	private float price;
    private final float taxPercent;
	
	
	public Item(String description, float price) {
		super();
		this.description = description;
		this.price = price;
		this.taxPercent = (float) (description.contains("imported")?0.15 :0.10) ; 
	}

	public String getDescription() {
		return description;
	}

	public float getPrice() {
		return price;
	}
	 
	public double getTax(){
		
		return this.taxPercent * price;
	}
}
