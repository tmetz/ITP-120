package currencyFormat;

public class CurrencyFormat {

	public static void main(String[] args) {
		double monthlyPay = 5000.0;
		double annualPay = monthlyPay*12;
		
		// you could also use %n instead of \n for newline
		System.out.printf("Your annual pay is $%,.2f\n", annualPay);

	}

}
