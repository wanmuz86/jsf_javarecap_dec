package com.example.helloworld;

public class PrimitiveDataTypesDemo {

	public static void main(String[] args) {
		// Declaring a variable with the data type
		
		final int age = 25; // immutable because of keywoard final
		byte smallNumber = 10;
		short shortNumber = 3000;
		long largeNumber = 1000000000000L; // Need to put L, if not it is 
		//considered as int
		float pi = 3.14f; // Need to put f , if not it will it's a double
		double distance = 123.45;
		char grade = 'A';
		boolean isJavaFun = true;
		
		// sysout + ctrl + space
		System.out.println("Integer value: "+age);
		System.out.println("Byte value "+smallNumber);
		System.out.println("Short number "+shortNumber);
		System.out.println("Long number "+largeNumber);
		System.out.println("Float number "+pi);
		System.out.println("DOuble number "+distance);
		System.out.println("Char is "+grade);
		System.out.println("Boolean is "+isJavaFun);
		
		
		
		

	}

}
