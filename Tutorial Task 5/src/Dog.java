//**************************************************//
//* Author: 1800977	                               *//
//* 							    		       *//
//* Tutorial Task: 5A        				       *//
//* Description: This class inherits from the      *//
//* superclass "Animal" which takes a unique       *//
//* method as well as inherited methods from the   *//
//* superclass      						       *//
//* Date: 18/03/2020						       *//
//**************************************************//
public class Dog extends Animal {

	// From the animal class the abstract method move is called.
	// In this case, the abstract method will print "Running" for this subclass.
	public void move() {
		System.out.println("Running");

	} // End of method

	// The method makeSound is inherited from the Animal superclass
	// to allow it to be overwritten and print the message "The dog goes WOOF!"
	public void makeSound() {
		System.out.println("The dog goes WOOF!");

	}// End of makeSound method
	public void sleep() {
		System.out.println("The dog is sleeping.");
	} // end of sleep method
} // End of subclass
