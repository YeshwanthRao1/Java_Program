package com.scanner;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		System.out.println("Enter your age?");
		System.out.println("Enter Your Name?");
		Scanner s = new Scanner(System.in);
		int nextInt = s.nextInt();
		String next = s.next();

		System.out.println("Your Age is:" + nextInt);
		System.out.println("Your name is:" + next);
	//	System.out.println("Enter your cgpa");
		// Scanner s1 = new Scanner(System.in);
		// double nextDouble = s. nextDouble();
		// System.out.println("Your CGPA is:"+nextDouble);
	}

}
