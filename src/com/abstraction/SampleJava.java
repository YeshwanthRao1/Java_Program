package com.abstraction;

public  class SampleJava  extends PersonalDetails {
	public void loanElligiblity() {
		System.out.println("Elligible");
		
	}
public void cibilScore() {
	System.out.println("Cibil Score is 9877");
	
}
	public static void main(String[] args) {
SampleJava s = new SampleJava();
s.loanElligiblity();
s.cibilScore();
s.name();
s.address();


	}

}
//////////////Abstract Class