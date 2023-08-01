package com.single_inheritance;

public class SchoolDetails {
	public void schName () {
		System.out.println("School Name is Matric");
	}
	public void schAddress () {
		System.out.println("School Adress is Chennai");
		
	}

	public static void main(String[] args) {
SchoolDetails s = new SchoolDetails();
s.schName();
s.schAddress();


	}

}
