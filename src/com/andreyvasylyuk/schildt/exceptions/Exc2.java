package com.andreyvasylyuk.schildt.exceptions;

public class Exc2 {
	public static void main(String[] args) {
		int d, a;
		
		try {
			d = 0;
			a = 10 / d;
			System.out.println("This text will not be printed.");
		} catch(ArithmeticException e) {
			System.out.println("Division by zero.");
		}
	}
}
