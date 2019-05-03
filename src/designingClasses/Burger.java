package designingClasses;

public class Burger {
	private boolean cooked;

	public Burger() {
		cooked = false;
	}

	public void cookMe() {
		cooked = true;
	}

	public boolean isCooked() {
		return cooked;
	}
}
