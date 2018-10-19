package objectProgramming;

import java.util.Scanner;

public class TestBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("What is the 1) balance and 2) interest rate (%) of the savings account?");
		double xBalance1 = input.nextDouble();
		double xInterest1 = (input.nextDouble() + 100) / 100;

		System.out.println("What is the 1) balance and 2) interest rate (%) of the checking account?");
		double xBalance2 = input.nextDouble();
		double xInterest2 = (input.nextDouble() + 100) / 100;

		BankAccount savings = new BankAccount(xBalance1, xInterest1);
		BankAccount checking = new BankAccount(xBalance2, xInterest2);

		savings.deposit(100);
		checking.setInterest(1.18);
		checking.withdraw(1000);
		savings.setInterest(1.2);
		checking.charge(20);

		System.out.println(
				"Savings Account; Balance: " + savings.getBalance() + " Interest Rate: " + savings.getInterest());
		System.out.println(
				"Checking Account; Balance: " + checking.getBalance() + " Interest Rate: " + checking.getInterest());

		input.close();
	}

}
