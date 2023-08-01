package com.inheritance;

public class AccountDetails extends StudentDetails{
	public void accountType() {
		System.out.println("Account type is General");
	}
	public void accountNumber() {
		System.out.println("Account Number is 12345");
	}
	public static void main(String[] args) {
		AccountDetails a = new AccountDetails();
		a.accountType();
		a.accountNumber();
		a.schName();
		a.schAddress();
		a.studentName();
		a.studentAddress();
		
		
		
	}

}
