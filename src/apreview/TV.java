package apreview;

public class TV implements Display {
	private double timeWatched;
	private boolean superBright;

	public TV(double xHours, boolean xSB) {
		timeWatched = xHours;
		superBright = xSB;
	}

	public void changeBrightness() {
		superBright = !superBright;
	}

	public void watch(double xMin) {
		if (superBright)
			xMin *= 2;
		timeWatched += xMin / 60;
	}

	public String toString() {
		return "Watch Time: " + timeWatched + ", Superbright? : " + superBright;
	}

	public boolean equals(TV other) {
		return this.toString().equals(other.toString());
	}

	public TV clone() {
		return new TV(timeWatched, superBright);
	}
}
