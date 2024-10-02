/* Bob has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively. We have to print the money deposited by him in a particular bank.
Create a class 'Bank' with a method 'getBalance' which returns 0 and another method ‘applyInterest’ which return the accountbalance. 
Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance' which returns the amount deposited in that particular bank. 
Override the method ‘applyInterest’ by adding the interest calculated with the Bank’s interest rate (Static variable for the Bank class). Call the method 'getBalance' and ‘applyInterest’ by the
Object of each of the three banks.*/
package Assignment_01;

public class BankCall {

	public static void main(String[] args) {
		BankA L = new BankA(1000);
		BankB M = new BankB(1500);
		BankC N = new BankC(2000);

		System.out.println("For Bank A ");
		System.out.println("Balance is : " + L.getBalance());
		System.out.println("After applying interest: " + L.applyInterest());
		System.out.println("==============================================");
		System.out.println("For Bank B ");
		System.out.println("Balance is : " + M.getBalance());
		System.out.println("After applying interest: " + M.applyInterest());
		System.out.println("==============================================");
		System.out.println("For Bank C ");
		System.out.println("Balance is : " + N.getBalance());
		System.out.println("After appyling interest: " + N.applyInterest());
		System.out.println("==============================================");

	}

}
