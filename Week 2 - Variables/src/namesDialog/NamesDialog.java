package namesDialog;

import javax.swing.JOptionPane;

public class NamesDialog {

	public static void main(String[] args) {
		String firstName, lastName;
		firstName = JOptionPane.showInputDialog("What is your first name?");
		lastName = JOptionPane.showInputDialog("What is your last name?");
		
		//The null option makes the dialog box centered in the screen
		JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + lastName);

	}

}
