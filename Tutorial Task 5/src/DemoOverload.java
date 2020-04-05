//**************************************************//
//* Author: 1800977	                               *//
//* 							    		       *//
//* Tutorial Task: 5        				       *//
//* Description: A class named DemoOverload        *//
//* which contains 3 methods for each Integer and  *//
//* double instance fields which will: add,		   *//
//* calculate the average and square them through  *//
//* overloading.								   *//
//* Date: 18/03/2020						       *//
//**************************************************//

//Name of the class is DemoOverload
public class DemoOverload {

	// Declaring and explicitly initialising the instance fields
	// Instance fields for each integer value
	private static Integer Int1 = 10;
	private static Integer Int2 = 20;

	// Instance fields for each double value
	private static double Double1 = 42.6;
	private static double Double2 = 30.1;

	private static Integer Denominator = 2;
	private static Integer MultipliedInt = 0;
	private static Double MultipliedDouble = 0.0;

	// A public method here named Sum is used to add the integers and display the
	// total in the main method below.
	public static Integer Sum(int i1, int i2) {
		// The return instance field here is instantiated to be equal to the sum of Int1
		// and Int2.
		return (Int1 + Int2);
	} // End of the Sum method
		// This overwritten version of the method Sum is used to add the double values
		// and display the total which overwrites the sum method for the integers and
		// instead will return the sum of the doubles.

	public static double Sum(double d1, double d2) {
		// The return instance field here is instantiated to be equal to the sum of
		// Double1 and Double2.
		return (Double1 + Double2);
	} // End of the double Sum method.

	// This is a public method named "Average" which will add the two Integers and
	// half the total, which will then display the total in the main method below.
	public static Integer Average(int i1, int i2) {
		MultipliedInt = Int1 * Int2;
		// This return instance field takes the value of the MultipliedInt and divides
		// it by the Denominator.
		return (MultipliedInt / Denominator);
	} // End of integer average method

	// This is a method used for calculating the average of the double values.
	public static double Average(double d1, double d2) {
		MultipliedDouble = Double1 * Double2;
		// This return instance field takes the value of MultipliedDouble and divides
		// it by the denominator.
		return (MultipliedDouble / Denominator);
	} // End of double average method

	// This is a method used for calculating the Square sum of an integer.
	public static Integer Square(int i1) {
		// This return instance is instantiated to be equal to the value of Int1
		// squared.
		return (Int1 * Int1);
	} // End of integer square method

	// This is a method used to calculate the Square sum of a double.
	public static double Square(double d1) {
		// The return instance here is instantiated to be equal to the value of Double1
		// squared.
		return (Double1 * Double1);
	} // End of double square method

	// The main method is used here to instantiate the objects and allow them to be
	// called upon and printed
	// in order to display the sum, average and square of each of the values given
	// above in each instance field.
	public static void main(String[] args) {
		System.out.printf("Here is the Int sum: %d %n", Sum(0, 0));
		System.out.printf("Here is the Double sum: %.1f %n ", Sum(0.0, 0.0));
		System.out.printf("Here is the Integer Average: %d %n ", Average(0, 0));
		System.out.printf("Here is the Double Average: %.1f %n ", Average(0.0, 0.0));
		System.out.printf("Here is the Integer Square: %d %n ", Square(0));
		System.out.printf("Here is the Double Square: %.1f %n ", Square(0.0));
	}// End of main method

} // End of class
