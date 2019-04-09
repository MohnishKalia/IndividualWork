package apreview;

public class Projector implements Display {
	private static int id = 100;
	private int idNum;
	private double hoursLeft;

	public Projector() {
		id++;
		idNum = id;
		hoursLeft = 1000;
	}

	public void watch(double xMin) {
		if (hoursLeft - xMin / 60 <= 0)
			System.out.println("Bulb will die, no video!");
		else
			hoursLeft -= xMin / 60;
	}

	public String toString() {
		return "ID Num: " + idNum + ", HoursLeft: " + hoursLeft;
	}

}
