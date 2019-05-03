package designingClasses;

public class Phone {
	private static int companyProductNumber = 0;
	private int productNumber;
	private long myNumber;
	private static final int maxMinutes = 10000;
	private int minutesUsed;

	// \((\d{3})[-.)](\d{3})[-.](\d{4})
	public Phone(long pN, int minU) {
		myNumber = pN;
		minutesUsed = minU;
		companyProductNumber++;
		productNumber = companyProductNumber;
	}

	public void makeCall(int min) {
		if (minutesUsed <= maxMinutes)
			minutesUsed += min;
	}

	public int timeRemaining() {
		return maxMinutes - minutesUsed;
	}

	public void reset() {
		minutesUsed = 0;
	}
}
