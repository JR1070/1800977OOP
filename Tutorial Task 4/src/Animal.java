//**************************************************//
//* Author: 1800977	                               *//
//* Week:  						    		       *//
//* Tutorial Task: 4        				       *//
//* Description: This class is the super class     *//
//* which contains methods and instance fields     *//
//* to be inherited by the corresponding subclasses*//
//* for each object.						       *//
//* Date: 10/03/2020						       *//
//**************************************************//

// The class Animal is the superclass
// The class is also defined as an abstract class which is extended and has its method implemented

public abstract class Animal {

	// Declaring and initialising the instance fields
	public boolean isAPet = true;
	public String owner = "Jonathan";

	// A public method is used here, called sleep which gives the message "Sleeping"
	public void sleep() {

		System.out.println("Sleeping");

	}

	public void eat() {
		System.out.println("Eating");
	}

	// A public abstract method is used here which will give a different message for
	// each child class
	public abstract void move();

}
// End of the superclass
