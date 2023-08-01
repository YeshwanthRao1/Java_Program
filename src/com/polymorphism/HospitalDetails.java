package com.polymorphism;

public class HospitalDetails {
	public void hospName() {
		System.out.println("Hospital Name is Abc");
		
	}
public void test (int a) {
	System.out.println("Hospital Address "+ a);
}

	public static void main(String[] args) {
		HospitalDetails h = new Demo();
		h.hospName();
		h.test(20);
		
		
}
		
	}


