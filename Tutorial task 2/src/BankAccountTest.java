//**********************************************//
//* Author: 1800977	                           *//
//* Week: 3						    		   *//
//* Tutorial Task: 2        				   *//
//* Description: A program with two classes    *//
//* BankAccount and BankAccountTest which takes*//
//* a user inputted balance and displays it.   *//
//*											   *//
//* Date: 									   *//
//**********************************************//

import javax.swing.JOptionPane;

// Created BankAccountTest method

public class BankAccountTest {

	private static String name = "";
	private static double balance = 0;

// bank accounts are initialised here
	private static BankAccount Account1;
	private static BankAccount Account2;
	private static BankAccount Account3;

	// main method here containing the two accounts which are initialised
	public static void main(String[] args) {
		// Account 1 contains a valid balance
		Account1 = new BankAccount("Johnny", 2700);
		// Account 2 contains an invalid balance
		Account2 = new BankAccount("Joseph", -120);

		// prints message showing account 1's details, including the balance, and
		// account name.
		System.out.println("Account 1's details are as follows: Name: " + Account1.getName() + ", Balance: "
				+ Account1.getBalance());
		// prints message showing account 2's details, including the balance and account
		// name.
		System.out.println("Account 2's details are as follows: Name: " + Account2.getName() + ", Balance: "
				+ Account2.getBalance());

		// Name variable here asks the user for their name with a JOptionPane. This will
		// create a text box for a user to enter their account name.
		name = JOptionPane.showInputDialog("What is your name?");
		// the balance is requested in a JOptionPane prompting the user to enter a
		// balance. Double.parseDouble returns a new double initialised to the value
		// represented by the specified string.
		balance = Double.parseDouble(JOptionPane.showInputDialog("Enter balance"));
		// a new account in instantiated here, with the variables of name and balance.
		Account3 = new BankAccount(name, balance);
		// this final JOptionPane will display all information the user has entered.
		JOptionPane.showMessageDialog(null,
				"Your name is: " + Account3.getName() + ", Your Balance is: " + Account3.getBalance());

	}

}
