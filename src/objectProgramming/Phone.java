package objectProgramming;

public class Phone {
	private long phoneNumber;
	private long speedDial;
	private long lastNumberCalled;
	final private long EMERGENCYNUMBER = 911;
	private long calls;
	private long minutes;

	public Phone() {

	}

	public Phone(long xPhone, long xSpeed, long xLast, long xCalls, long xMinutes) {
		phoneNumber = xPhone;
		speedDial = xSpeed;
		lastNumberCalled = xLast;
		calls = xCalls;
		minutes = xMinutes;
	}

	public void makeACall(long xSent, long xMinChange) {
		lastNumberCalled = xSent;
		minutes += xMinChange;
		calls++;
	}

	public long getCalls() {
		return calls;
	}

	public long getMinutes() {
		return minutes;
	}
}
