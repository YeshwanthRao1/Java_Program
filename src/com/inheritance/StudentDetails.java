package com.inheritance;

public class StudentDetails extends SchoolDetails {
	
	public void studentAddress() {
		System.err.println("Student Address is Chennai");
	}
	public void studentName() {
		System.err.println("Student Name is Rock");
	}
	public static void main(String[] args) {
		StudentDetails c = new StudentDetails();
		c.studentName();
		c.studentAddress();
		c.schName();
		c.schAddress();
		
		
				
			
	}
 
	}


