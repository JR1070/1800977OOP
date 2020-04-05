//***********************************************//
//* Author: 1800977	                            *//
//* 		 					    		    *//
//* Tutorial Task: 5A        				    *//
//* Description: This class is used to test	    *//
//* the sub and superclasses to check that child*//
//* classes will display the correct information*//
//* This is similar to the previous tutorial    *//
//* task but the subclass will overwrite the    *//
//* makeSound method in the Animal class as well*//
//* as the instance field "owner".				*//
//* for each object.						    *//
//* Date: 18/03/2020						    *//
//***********************************************//

public class AnimalTest {

	// A main method is used here to instantiate the three objects
	// This method allows the related methods from each of the subclasses to be
	// printed.
	public static void main(String[] args) {
		// Objects are instantiated here
		Dog dogInstance = new Dog();

		Lion lionInstance = new Lion();

		Cat catInstance = new Cat();

		System.out.println("The dog methods will now  be tested!");

		// Each of the methods for the "Dog" object are given here, but changed
		// Within the subclass, meaning that the methods in the subclass will be printed
		// here, instead of the default values in the Animal superclass. This is
		// polymorphism.
		dogInstance.makeSound();
		dogInstance.sleep();
		dogInstance.setOwner("Mike");

		System.out.println(dogInstance.getOwner());
		System.out.printf("\n");

		System.out.println("The lion methods will now be tested!");

	// For the lion, the method of makeSound and eat are called upon and are changed according to the subclass.
	// The owner is set here too, which is then printed below.
		lionInstance.makeSound();
		lionInstance.eat();
		lionInstance.setOwner("John");
		
		System.out.println(lionInstance.getOwner());
		System.out.printf("\n");

		System.out.println("The cat methods will now be tested!");

		// For the cat, the method of makeSound and sleep are called upon and are changed according to the subclass.
		// The owner is set here too and printed below.
		catInstance.makeSound();
		catInstance.sleep();
		catInstance.setOwner("Alice");
		
		System.out.println(catInstance.getOwner());
		System.out.printf("\n");

	}
	// End of the main method
}
// End of the class