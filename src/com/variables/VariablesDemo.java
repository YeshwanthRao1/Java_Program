package com.variables;

public class VariablesDemo {
	static int b = 20;

	public static void demo() {
		int a = 10;
		System.out.println("The Local Variable is:" + a);
	}

	public static void main(String[] args) {
		// VariablesDemo v = new VariablesDemo();
		demo();
		System.out.println(b);
	}

	static {
		System.out.println("This is a Static Block");

	}
}
