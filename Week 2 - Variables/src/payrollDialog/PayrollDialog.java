package payrollDialog;

import javax.swing.JOptionPane;

public class PayrollDialog {

	public static void main(String[] args) {
		String name;
		int hours;
		double payRate;
		double grossPay;
		
		name = JOptionPane.showInputDialog("Name: ");
		String inputString = JOptionPane.showInputDialog("Hours worked: ");
		hours = Integer.parseInt(inputString);
		
		inputString = JOptionPane.showInputDialog("Pay rate: ");
		payRate = Double.parseDouble(inputString);
		
		JOptionPane.showMessageDialog(null, "Hello " + name + ".  Your salary is " + payRate*hours);
		

	}

}
