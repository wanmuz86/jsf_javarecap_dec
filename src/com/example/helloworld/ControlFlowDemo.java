package com.example.helloworld;

public class ControlFlowDemo {

	public static void main(String[] args) {
		// ControlFlowDemo
		
		// IF else
		
		int num = 10;
		
		if (num > 0) {
			System.out.println("Number is positive");
		} else if (num < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println("Number is zero");
		}
		
		// Switch Statement
		
		int day = 1;
		
		switch (day) {
	
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
			
		default:
			System.out.println("Invalid date");
		}
		
		// FOr loop 
		
		for (int i = 1; i<= 10; i++) {
			System.out.println(i);
		}
		
		// While 
		System.out.println("While Example");
		int i = 0;
		int count = 0;
		// 0 
		// count = 1 , i= 1
		// count = 1, i =  2
		// 2
		// count = 2, i = 3
		// count = 2, i = 4
		//  4
		//count = 3, i = 5
		//count = 3, i = 6
		// 6
		//count = 4, i = 7
		//count = 4, i = 8
		// 8
		
		while (count < 5) {
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
			}
			i++;
		}
		
		// DO while
		System.out.println("Do while example");
		// In this example 10 is executed once although it does not fulfill 
		// the (while) criteria 
		int j = 10;
		do {
			System.out.println(j);
			j++;
		}
		
		while (j <=5);
		
		System.out.println("For loop with break");
		for (int k = 0; k<= 5; k++) {
			if (k == 3) {
				break;
			}
			System.out.println(k);
		}
		
		System.out.println("For loop with continue");
		
		for (int l = 0; l<=5; l++) {
			if (l == 3) {
				continue;
			}
			System.out.println(l);
		}

	}
	


}
