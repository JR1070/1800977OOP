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
public class BankAccount {
	public String name;
	public double balance;

	public String getName() {
		return name;
	}

	// setName method here to set the name of the account variable.
	public void setName(String name) {
		this.name = name;
	}

	// BankAccount method here asks for a name and theBalance.
	public BankAccount(String name, double theBalance) {
		this.name = name;
		balance = theBalance;
	}

	// getBalance method returns the balance from the double value the user will
	// enter.
	public double getBalance() {
		return balance;
	}

	// deposit method here takes the value of the total and combines the balance and
	// the total to give the balance.
	public void deposit(double total) {
		balance = balance + total;
	}

	// payIn method here takes integer from user's input.
	public void payIn(int i) {

	}

	// setting string balance here. The method calls upon a string called
	// showInputDialog which displays the input of the user.
	public void setStringbalance(String showInputDialog) {

	}

}
