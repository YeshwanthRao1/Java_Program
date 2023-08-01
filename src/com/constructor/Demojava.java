package com.constructor;

public class Demojava extends EmployeeDetails {
	private void test() {
		System.out.println("child class");
	}
	public static void main (String[] args) {
		Demojava d = new Demojava();
		d.test();
		d.empName();

	}

}
