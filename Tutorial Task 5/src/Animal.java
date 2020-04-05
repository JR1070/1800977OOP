//**************************************************//
//* Author: 1800977	                               *//
//* 		 					    		       *//
//* Tutorial Task: 5A        				       *//
//* Description: A modified version of the class   *//
//* Animal where the subclasses are able to use    *//
//* polymorphism to give them unique properties    *//
//* which are individually defined, but still can  *//
//* inherit from the Animal superclass at the same *//
//* time.										   *//
//* Date: 18/03/2020						       *//
//**************************************************//

// The class Animal is the superclass
// The class is also defined as an abstract class which is extended and has its method implemented

public abstract class Animal {

	// Declaring and initialising the instance fields
	public boolean isAPet = true;
	public String owner = "John";

	// A public method is used here, called sleep which gives the message "Sleeping"
	public void sleep() {

		System.out.println("Sleeping");

	} // End of sleep method
		// A public method is used here which will print the message "Eating"

	public void eat() {
		System.out.println("Eating");
	} // End of eat method

	// A public method is used here which will give a different message for
	// each child class
	public void move() {

	}

	// A public method called "makeSound" here will give the message "The animal
	// makes sounds".
	// The method will then be inherited by each of the child classes (Dog, Cat,
	// Lion) where they will be overwritten and assigned their own unique "sound".
	public void makeSound() {
		System.out.println("The animal makes sounds");

	} // End of the makeSound method

	// A getter method is used here in order to be used as an accessor to return the
	// "owner" instance field.
	public String getOwner() {
		return owner;
	} // End of getOwner method

	// A setter method is used here for the "owner" instance field, which can then
	// be used as a mutator and change depending on the application's object.
	public void setOwner(String newOwner) {
		owner = newOwner;
	} // End of the setter method

}
// End of the superclass