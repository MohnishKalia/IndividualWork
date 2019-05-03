package apreview;

public class Employee {
	private String name;
	private double rate;
	private int[] hours;
	private static int employeeClassNumber = 0;
	private int employeeNumber;

	public Employee() {
		name = "John Smith";
		rate = 10;
		hours = new int[52];
		for (int i = 0; i < hours.length; i++)
			hours[i] = (int) Math.floor(Math.random() * 41);
		employeeNumber = employeeClassNumber++;
	}

	public void modifyRate(double xRate) {
		rate = xRate >= 0 ? xRate : 7.25;
	}

	public double calcPay(int week) {
		return hours[week] * rate;
	}
}
