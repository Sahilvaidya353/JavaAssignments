package Assignment2;

public class SavingsAccount {
	private static double annualInterestRate;
	private double savingsBalance;

	public SavingsAccount(double initialBalance) {
		this.savingsBalance = initialBalance;
	}

	public void calculateMonthlyInterest() {
		double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance += monthlyInterest;
	}

	public static void modifyInterestRate(double newRate) {
		annualInterestRate = newRate / 100;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}
}
