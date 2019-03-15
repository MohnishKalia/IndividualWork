package apreview;

public class PassengerCar {
	private double maxWeight;

	public PassengerCar(double baseWt, int maxPass) {
		maxWeight = baseWt + 300 * maxPass;
	}

	public double getMaxWeight() {
		return maxWeight;
	}

}
