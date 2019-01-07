package arrays;

public class MallSanta {
	private String name;
	private int age;
	private boolean rec;

	public MallSanta(String xName, int xAge, boolean xRec) {
		name = xName;
		age = xAge;
		rec = xRec;
	}

	public String getName() {
		return name;
	}

	public boolean employable() {
		if (age >= 50 && age <= 70 && rec == false) {
			return true;
		} else {
			return false;
		}
	}
}
