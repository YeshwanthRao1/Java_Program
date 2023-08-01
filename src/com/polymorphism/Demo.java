package com.polymorphism;

public class Demo extends HospitalDetails{
	public void hospName() {
		System.out.println("Hospital Name is xyz");
		super.hospName();
	}
	public void test(int a) {
		System.out.println("Hospital No "+a);
super.test(a);;
	}
	public static void main(String[]args) {
		Demo d = new HospitalDetails();
		d.hospName();
		d.test(205205);
		
			
	}
} ///////overriding_Downcasting
