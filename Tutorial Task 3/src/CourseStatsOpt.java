//**********************************************//
//* Author: 1800977	                           *//
//* Week:  						    		   *//
//* Tutorial Task: 3        				   *//
//* Description: An application which counts   *//
//*	User-input integers to increment passes or *//
//* fails.									   *//
//* Date: 03/03/2020						   *//
//**********************************************//

import javax.swing.JOptionPane;

public class CourseStatsOpt {

	static int passes = 0;
	static int failures = 0;
	static int StudentCounter = 1;
	static int result = 0;

	public static void main(String[] args) {
		// While loop is initialised here, showing that the StudentCounter has 20
		// students on the course

		while (StudentCounter <= 20) {
			// JOptionPane here takes the user's input and turns it into a result integer
			int result = Integer.parseInt(JOptionPane.showInputDialog("Enter Exam Results"));

			if (result == 1)
			// Else if statement here shows that if the result is equal to a 1 (pass) then
			// it will change the interval pass to 1
			{
				passes++;
			} else
			// If a value equal to 0, or an invalid input (e.g. 2, 3, etc) it will become a
			// failure
			{
				failures++;
			}
			StudentCounter++;
		}
		// JOptionPane here will display the number of passes and failures in a dialog
		// box
		JOptionPane.showMessageDialog(null, "The number of passes is: " + passes);
		JOptionPane.showMessageDialog(null, "The number of failures is: " + failures);

		if (passes > 16) {
			// Else if statement here determines that if the number of passes is equal to,
			// or more than 16, then it will display "Congratulations to the tutors!"
			JOptionPane.showMessageDialog(null, "Congratulations to the tutors!");
		} else {
			// Here, the else if statement determines that if the number of passes is less
			// than 16, it will display "Fewer than 16 students have passed."
			JOptionPane.showMessageDialog(null, "Fewer than 16 students passed.");

		}
	}

}
// End of the program