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
public class Cat extends Animal {

	public void Sleep() {
		System.out.println("The cat is sleeping");
	} // end of sleep method

	// This method is inherited from the Animal superclass to allow it to be
	// overwritten and print the message "The cat goes MEOW!"
	public void makeSound() {
		System.out.println("The cat goes MEOW!");
	}// End of method
} // End of class
