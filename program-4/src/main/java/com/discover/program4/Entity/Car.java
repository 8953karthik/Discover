package com.discover.program4.Entity;




public class Car {


	private int amount; 
	private String name;
	private String color;
	
	public Car() {
		super();
	}

	public Car(int amount,String name, String color) {
		super();
		this.amount = amount;
		this.name = name;
		this.color = color;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [amount=" + amount + ", name=" + name + ", color=" + color + "]";
	}	
}
