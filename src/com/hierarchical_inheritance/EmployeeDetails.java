package com.hierarchical_inheritance;



public class EmployeeDetails extends BankDetails{

	public void empName() {
		System.out.println("Employee name is Mack");
		
	}
	public void empId() {
		System.out.println("Employee Id is 3050");
		
	}
	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();
		e.empName();
		e.empId();
		e.bankName();
		
		
		
		

	}
}////////////Hierarchical Inheritance