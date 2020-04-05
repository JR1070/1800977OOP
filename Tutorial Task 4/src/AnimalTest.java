//***********************************************//
//* Author: 1800977	                            *//
//* Week:  						    		    *//
//* Tutorial Task: 4        				    *//
//* Description: This class is used to test	    *//
//* the sub and superclasses to check that child*//
//* classes will display the correct information*//
//* for each object.						    *//
//* Date: 10/03/2020						    *//
//***********************************************//

public class AnimalTest {

	// A main method is used here to instantiate the three objects
	// This method allows the related methods from each of the subclasses to be
	// printed
	public static void main(String[] args) {
		Dog dog = new Dog();

		Lion lion = new Lion();

		Cat cat = new Cat();

		System.out.printf("%20s", "The dog will now do things!");
		System.out.printf("\n");

		// Each of the methods for the 'Dog' object are given here, but changed
		// Within the subclass, meaning that the methods in the subclass will be printed
		// here, instead of the default values in the Animal superclass. This is
		// inheritance.
		dog.bark();
		dog.sleep();
		dog.eat();
		dog.move();
		System.out.printf("\n");

		System.out.printf("%20s", "The lion will now do things!");
		System.out.printf("\n");

		// For the lion object, the methods "roar" and "eat" are called upon
		// which will give the messages "Roar!" and "Eating".
		lion.roar();
		lion.eat();
		lion.sleep();
		lion.move();
		System.out.printf("\n");

		System.out.printf("%20s", "The cat will now do things!");
		System.out.printf("\n");

		// For the cat, the methods "meow" and "move" are called, which are then changed
		// as defined by the subclass.
		cat.meow();
		cat.sleep();
		cat.eat();
		cat.move();
		System.out.printf("\n");

	}
	// End of the main method
}
// End of the class
