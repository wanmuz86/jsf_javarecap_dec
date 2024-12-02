package com.example.helloworld;

public class ArraysDemo {

	public static void main(String[] args) {
		// Declaring an array of integer
		// The array size is 5
		// mutable - the size is fixed 5 -> Unlike collection (later)
		// Array , best practice declared in plural
		int[] numbers = {1,2,3,4,5};
		
		//Bring out the first element (index 0)
		System.out.println("First element: "+numbers[0]);
		
		//Modfying an element of an array
		numbers[0] = 10;
		System.out.println("Modified element "+numbers[0]);
		
		//Iterating through an array
		
		// For every number in numbers 
		// For (singular) in (plural) // BP for the loop
		for (int number:numbers) {
			System.out.println(number);
		}

	}

}
