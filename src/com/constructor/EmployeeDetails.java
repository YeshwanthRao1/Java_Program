package com.constructor;

public class EmployeeDetails {
	public void empName() {
		System.out.println("Employee Name is Yeshwanth");
	}

	public EmployeeDetails() {
		System.out.println("This is a non Parameterized constructor");
	}

	public EmployeeDetails(long a) {
		System.out.println("This is a Parameterized Constructor" + a);

	}

	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();
		e.empName();

		EmployeeDetails e1 = new EmployeeDetails(12345);

	}

}
