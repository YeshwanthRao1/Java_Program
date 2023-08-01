package com.abstraction;

public class BankDetails implements Icici,Axis,Hdfc{
	
	@Override
	public void name() {
System.out.println("Yeshwanth");		
	}

	@Override
	public void address() {
System.out.println("Madhavaram");		
	}

	@Override
	public void loanElligibility() {
System.out.println("Elligble");		
	}

	@Override
	public void cibilScore() {
System.out.println("Cibil Score is 700");		
	}

	@Override
	public void bankName() {
System.out.println("Bank Name is Icici");		
	}

	@Override
	public void BankAddress() {
System.out.println("Bank Address is Chennai");		
	}
	public static void main(String[] args) {
		
		
		
		
		
BankDetails b = new BankDetails();
b.name();
b.address();
b.loanElligibility();
b.cibilScore();
b.bankName();
b.BankAddress();


}
		
	}
///////////Interface.......
