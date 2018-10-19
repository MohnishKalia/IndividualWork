package objectProgramming;

public class BankAccount {
	private double balance;
	private double interest;

	public BankAccount() {

	}

	public BankAccount(double xBalance, double xInterest) {
		balance = xBalance;
		interest = xInterest;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double xBalance) {
		balance = xBalance;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double xInterest) {
		interest = xInterest;
	}

	public void charge(double xCharge) {
		balance -= xCharge;
	}

	public void deposit(double xDeposit) {
		balance += xDeposit;
	}

	public void withdraw(double xWithdraw) {
		balance += xWithdraw;
	}
}
