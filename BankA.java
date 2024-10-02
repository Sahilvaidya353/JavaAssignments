package Assignment_01;

public class BankA extends Bank {

	private double balance;

	public BankA(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public double applyInterest() {
		return balance + balance * interest / 100;
	}

}
