//**********************************************//
//* Author: 1800977	                           *//
//* Week: 2 					    		   *//
//* Tutorial Task: 1        				   *//
//* Description: A program which takes 3	   *//
//* integers and puts them in ascending order, *//
//* and calculates their average which is then *//
//* displayed along with the ascending order.  *//
//*											   *//
//* Date: 10/02/2020						   *//
//**********************************************//

import java.util.*;

public class CalculatorB {
	// integers are initialised here
	private static int firstInt = 0;
	private static int secondInt = 0;
	private static int thirdInt = 0;
	private static int sum = 0;
	private static int denominator = 3;
	// scanner here will take user input
	private static Scanner userInput;

	// main method starts here
	public static void main(String[] args) {
		// user's input will be stored here
		userInput = new Scanner(System.in);
		System.out.println("Enter the first number");
		// first integer is taken from userInput
		firstInt = userInput.nextInt();

		System.out.println("Enter the second number");

		secondInt = userInput.nextInt();
		System.out.println("Enter the third number");

		thirdInt = userInput.nextInt();
		// If statement here begins, with the conditions for the block of code written
		// beside the statement. If this condition is met, then the System.print within
		// the statement will be printed.
		if ((firstInt < secondInt) && (firstInt < thirdInt) && (secondInt < thirdInt))

		{

			// print out firstInt, secondInt and thirdInt
			System.out.print("The ascending order is: " + firstInt + "," + secondInt + "," + thirdInt);

		}
		
		else if ((firstInt < secondInt) && (firstInt < thirdInt) && (secondInt > thirdInt))

		{

			// print out firstInt, thirdInt and secondInt
			System.out.print("The ascending order is: " + firstInt + "," + thirdInt + "," + secondInt);
		}

		else if ((secondInt < firstInt) && (secondInt < thirdInt) && (firstInt < thirdInt))

		{

			// print out secondInt, firstInt and thirdInt
			System.out.print("The ascending order is: " + secondInt + "," + firstInt + "," + thirdInt);
		}

		else if ((secondInt < firstInt) && (secondInt < thirdInt) && (firstInt > thirdInt))

		{

			// print out secondInt, thirdInt and firstInt
			System.out.print("the ascending order is: " + secondInt + "," + thirdInt + "," + firstInt);
		}

		else if ((thirdInt < firstInt) && (thirdInt < secondInt) && (firstInt < secondInt))

		{

			// print out thirdInt, firstInt and secondInt
			System.out.print("The ascending order is: " + thirdInt + "," + firstInt + "," + secondInt);
		}

		else if ((thirdInt < firstInt) && (thirdInt < secondInt) && (firstInt > secondInt))

		{

			// print out thirdInt, secondInt and firstInt
			System.out.print("The ascending order is: " + thirdInt + "," + secondInt + "," + firstInt);
		}

		else if ((firstInt == secondInt) && (secondInt == thirdInt))

		{

			// print out all three numbers are equal
			System.out.println("All three numbers are equal");
		}

		else

		{

			// print out error
			System.out.println("Error. Please enter valid integers!");

		}
		sum = firstInt + secondInt + thirdInt;
		// average integer is initialised here, which is equal to the sum divided by the
		// denominator.
		int average = sum / denominator;
		// Average is printed here
		System.out.println(" The average of the three integers is: " + average);
	} // end of main method

} // end of class