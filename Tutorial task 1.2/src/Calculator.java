//**********************************************//
//* Author: 1800977	                           *//
//* Week: 2 					    		   *//
//* Tutorial Task: 1        				   *//
//* Description: A program which takes two	   *//
//* integers from a user and computes their sum*//
//*											   *//
//* Date: 10/02/2020						   *//
//**********************************************//

import java.util.*;

public class Calculator {
	// Initialising integers and the scanner here first with a value of 0 to ensure
	// an fair test.
	private static int firstInt = 0;
	private static int secondInt = 0;
	private static int sum = 0;
	// Scanner used here to get a user's input and read it
	private static Scanner userInput;
	// main method starts here
	public static void main(String[] args) {
		// Scanner is taking the user input here.
		userInput = new Scanner(System.in);
		// System asks user for the first integer
		System.out.println("Enter the first number");
		// the firstInt is equal to the value of the user input
		firstInt = userInput.nextInt();
		// System asks user for another integer
		System.out.println("Enter the second number");
		// the secondInt is equal to the value of the user input, as it is above
		secondInt = userInput.nextInt();
		// the sum has the value of both integers combined
		sum = firstInt + secondInt;
		// sum is printed here along with some text for clarification
		System.out.println("the sum of the two numbers is: " + sum);

	} // end of main method
} // end of class