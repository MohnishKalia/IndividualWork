package objectProgramming;

public class Worker {
	private int hours;
	private double rate;

	public Worker() {

	}

	public Worker(int xHours, double xRate) {
		hours = xHours;
		rate = xRate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int xHours) {
		hours = xHours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double xRate) {
		rate = xRate;
	}

	public double payCheck() {
		double paycheck = hours * rate;
		return paycheck;
	}

	public void raise(double changeR) {
		rate = rate + changeR;
	}
}
