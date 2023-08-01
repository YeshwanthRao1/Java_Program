package com.polymorphism;

public class EmployeeDetails {

	public void empName(){

		System.out.println("Employee Name is Yes");
	}
		public void empName(int a) {
			System.out.println("Employee Id is "+a);
		}
		public void empName (int a,String s) {
			System.out.println("Employee Address is:"+a+","+s);
		}
		public void empName(String s,int a) {
			System.out.println("New Method"+a+s);
			
		}
		public static void main(String[] args) {
			EmployeeDetails e = new EmployeeDetails();
			e.empName();
			e.empName(10);
			e.empName(11,"chennai");
			e.empName("Hi",1);
			
		
		}
	}/////Method OverLoading