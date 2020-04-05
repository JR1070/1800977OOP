//**********************************************//
//* Author: 1800977	                           *//
//* Week:  						    		   *//
//* Tutorial Task: 3        				   *//
//* Description: An application which counts   *//
//*	User-input integers to increment passes or *//
//* fails.									   *//
//* Date: 03/03/2020						   *//
//**********************************************//

import java.util.Scanner;

public class CourseStats {
	// initialising passes, fails, and students as integers

	static int passes = 0;
	static int failures = 0;
	static int StudentCounter = 1;
	static int result = 0;
	// Scanner is initialised here to convert the input from the user to the
	// "result" integer
	static Scanner theInput = new Scanner(System.in);

	public static void main(String[] args) {
		while (StudentCounter < 21)
		// While loop is initialised here with the condition that while the student
		// counter is equal to 21, it will accept 21 inputs from the user
		{

			System.out.println("please enter the next exam result");
			int result = theInput.nextInt();
			// The input is turned from the input into the result integer
			if (result == 1)
			// If the result is equal to 1, it will become a pass, which is added to the
			// total passes below
			{
				passes = passes + 1;
			} else
			// Anything else, such as an invalid input or a 0 is turned into a failure and
			// added to the total of failures
			{
				failures = failures + 1;

			}
			StudentCounter++;

		}
		System.out.println("The number of passes is:" + passes);
		System.out.println("The number of failures is:" + failures);

		if (passes > 16)
		// If the total sum of all passes is equal to or more than 16, the system will
		// print "Congratulations to the tutors!"
		{
			System.out.println("Congratulations to the tutors!");
		} else
		// If the total sum of all passes is less than 16, which is the only possibility
		// given the configuration, it will print the
		// message "Fewer than 16 students passed."
		{
			System.out.println("Fewer than 16 students passed.");

		}

	}

}
// End of the program