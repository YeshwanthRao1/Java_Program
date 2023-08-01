package com.polymorphism;

public class BankDetails extends StudentDetails {
	public void bankName () {
		System.out.println("Bank Name is Hdfc");
		super.studName();

	}
	public static void main(String[]args) {
		BankDetails b = new BankDetails();

	b.bankName();
	
	}
	

}
