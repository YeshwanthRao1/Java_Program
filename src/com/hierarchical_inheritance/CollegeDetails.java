package com.hierarchical_inheritance;



public class CollegeDetails extends BankDetails {
	public void clgName() {
		System.out.println("College Name is Annis");
	}
	public void collegeAddress() {
		System.out.println("College Address is Anna Nagar");
	}
		public static void main(String[]args) {
			
		
			
		CollegeDetails c = new CollegeDetails();
		c.clgName();
		c.collegeAddress();
		c.bankName();


		
		
		
	}
}