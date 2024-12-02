package com.example.helloworld;

public class ArithmeticOperatorsDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		
		// Relational Operators
		
		// false
		System.out.println("a == b: " + (a == b));
		// true
		System.out.println("a != b: " + (a != b));
		
		// false
		System.out.println("a > b: " + (a> b));
		
		//true
		System.out.println("a < b: " + (a< b));
		
		// Logical operators
		
		boolean condition = a > b; // false
		boolean condition2 = a > 5; // true
		
		// && operation
		// both needs to be true for it to be true
		// false
		System.out.println("condition1 && condition2 " + (
				condition && condition2));
		
		// || operation
		// One of it needs to be true for it to be true
		// true
		System.out.println("condition1 || condition2 "+ (
				condition || condition2));
		
		// ! operation
		// It will reverse the boolean : false -> true
		System.out.println("!condition1 "+!condition);
		

	}

}
