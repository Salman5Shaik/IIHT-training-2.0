package com.mvc.lifecycle;

public class Motorbike {
	private String name;
	private double price;

	public Motorbike() {
		super();
	}

	public Motorbike(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name");
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");

		this.price = price;
	}

	@Override
	public String toString() {
		return "Motorbike [name=" + name + ", price=" + price + "]";
	}
	
	public void init() {
		System.out.println("this bean is been initialized");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}

}
