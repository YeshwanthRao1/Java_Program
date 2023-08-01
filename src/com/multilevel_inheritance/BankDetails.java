package com.multilevel_inheritance;



public class BankDetails extends CollegeDetails {
	public void bankName () {
		System.out.println("Bank Name is Hdfc");
	

	}
	public static void main(String[]args) {
		BankDetails b = new BankDetails();

	b.bankName();
	b.clgName();
	b.collegeAddress();
	
	}
	

}
