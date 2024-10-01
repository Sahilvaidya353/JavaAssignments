package Assignment2;

public class TestSavingsAccount {

	public static void main(String[] args) {

		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);

		SavingsAccount.modifyInterestRate(3.0);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.printf("Saver 1 new balance: ", saver1.getSavingsBalance());
		System.out.printf("Saver 2 new balance: ", saver2.getSavingsBalance());

		SavingsAccount.modifyInterestRate(4.0);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.printf("Saver 1 new balance after interest: ", saver1.getSavingsBalance());
		System.out.printf("Saver 2 new balance after interest: ", saver2.getSavingsBalance());
	}

}
