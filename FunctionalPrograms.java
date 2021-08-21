package com.bridgelabz.FunctionalPrograms;

import java.util.Scanner;
public class FunctionalPrograms 
{
	static void roots(int a, int b, int c) {
		int delta = Math.abs(b * b - 4 * a * c);
		double x1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
		double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
		System.out.println(x1);
		System.out.println(x2);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter the value of a ");
			int a = s.nextInt();
			System.out.println("Enter the value of b");
			int b = s.nextInt();
			System.out.println("Enter the value of c");
			int c = s.nextInt();
			roots(a, b, c);
		} catch (Exception e) {
			System.out.println("Enter correct input");
		}
		s.close();
	}
}