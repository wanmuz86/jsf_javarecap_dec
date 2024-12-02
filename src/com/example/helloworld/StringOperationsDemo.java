package com.example.helloworld;

public class StringOperationsDemo {

	public static void main(String[] args) {
		String greetings = "Hello";
		String name = "John";
		
		// Concatenation
		// Combining multiple String
		
		String message = greetings + ", "+name + "!";
		// This will bring out "Hello, John!"
		System.out.println(message);
		
		//Length (how many characters are there?)
		System.out.println("Length of the message is "+
		message.length()); // 12
		
		// Characters at a specific position
		// Character index starts from 0
		// charAt(1) will return 'e'
		System.out.println("Character at 1 is "+message.charAt(1));
		
		//Substring
		// From 7 until 11 (excluding 11th)
		// This will return "John"
		String subMessage = message.substring(7,11);
		System.out.println(subMessage);

	}

}
