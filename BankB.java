package Assignment_01;

public class BankB extends Bank {

	private double balance;

	public BankB(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public double applyInterest() {
		return balance + balance * interest / 100;
	}
}
