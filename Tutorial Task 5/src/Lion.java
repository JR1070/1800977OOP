//**************************************************//
//* Author: 1800977	                               *//
//* 							    		       *//
//* Tutorial Task: 5A       				       *//
//* Description: This class inherits from the      *//
//* superclass "Animal" which takes a unique       *//
//* method as well as inherited methods from the   *//
//* superclass      						       *//
//* Date: 18/03/2020						       *//
//**************************************************//
// The name of this subclass is Lion
public class Lion extends Animal {

	// This is a unique method to the Lion subclass, and prints the message "the
	// lion doesn't want to move!"
	public void move() {
		System.out.println("The lion doesn't want to move!");

	}// End of method

	// this method is inherited from the Animal superclass and prints the unique
	// message saying "The lion goes ROAR!"
	public void makeSound() {
		System.out.println("The lion goes ROAR!");

	} // End of method
	public void eat() {
		System.out.println("The lion is eating!");
	} //End of eat method
} // End of class
