/*
 * Sales Commission Selection Lab
 * 
 * Author: Tamara Metz
 * Date: 9-8-18
 * 
 * The purpose is this lab is to:
 * Take input of a name and sales amount, 
 * then calculate the monthly commission a salesperson should earn.
 * 
 * 
 */

package salesCommissionSelectionLab;

import java.util.Scanner;

public class SalesCommissionSelectionLab {

	public static void main(String[] args) {
		String lastName;
		int salesAmt;
		double percentageRate;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter salesperson's last name: ");
		lastName = input.nextLine();
		System.out.println("Please enter salesperson " + lastName + "'s monthly sales: ");
		salesAmt = input.nextInt();
		
// Assignment asks for nested conditionals, so rewriting as nested below.
//		if (salesAmt < 2500) {
//			percentageRate = 0.03;
//		}
//		else if (salesAmt >= 2500 && salesAmt < 10000) {
//			percentageRate = 0.06;
//		}
//		else {
//			percentageRate = 0.1;
//		}
		
		if (salesAmt < 2500) {
			percentageRate = 0.03;
		}
		else {
			if (salesAmt >= 2500 && salesAmt < 10000) {
				percentageRate = 0.06;
			}
			else {
				percentageRate = 0.1;
			}
		}
		
		System.out.println("Salesperson " + lastName + "'s commission is $" + percentageRate*salesAmt);
		
		input.close();
	}

}
