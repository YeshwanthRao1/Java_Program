package com.polymorphism;

public class Demo_Java extends ShopDetails{
	public void shopName() {
		System.out.println("Shop Name is xyz");
		super.shopName();
		
	}

	public static void main(String[] args) {
Demo_Java d = new Demo_Java();
d.shopName();


	}

	}///////Overriding



