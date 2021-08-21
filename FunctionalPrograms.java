package com.bridgelabz.FunctionalPrograms;

import java.util.Scanner;
public class FunctionalPrograms 
{
	static void windChill(double f, double ws) {

		double w = 35.74 + 0.62158 * f + (0.4275 * f - 35.75) * Math.pow(ws, 0.16);
		System.out.println(w);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter the temperature in fahrenheit:");
			double f = s.nextDouble();
			System.out.println("Enter the wind speed in miles per hour:");
			double ws = s.nextDouble();
			if (Math.abs(f) > 50 || ws > 120 || ws < 3) {
				System.out.println("Enter correct input");
			} else {
				windChill(f, ws);
			}
		} catch (Exception e) {
			System.out.println("Enter proper input");
		}
		s.close();
	}
}