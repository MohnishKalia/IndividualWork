package objectProgramming;

public class Car {
	private double mPG;
	private double capacity;
	private double fuel;
	private double odometer;

	public Car() {
		mPG = 20;
		capacity = 20;
		fuel = 20;
		odometer = 0;
	}

	public Car(double xMPG, double xCapacity, double xFuel, double xOdometer) {
		mPG = xMPG;
		capacity = xCapacity;
		fuel = xFuel;
		odometer = xOdometer;
	}

	public void fill() {
		double gallonsUsed = capacity - fuel;
		fuel = capacity;
	}

	public void drive(double xMiles) {
		double milesDriven = xMiles;
		odometer += xMiles;
	}

	public double getFuel() {
		return fuel;
	}

	public double getOdo() {
		return odometer;
	}

	public double getMPG() {
		return mPG;
	}
}