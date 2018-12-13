package arrays;

public class LongAndShort {
	private String full;
	private String first;
	private String last;
	private int age;

	public LongAndShort(String xFull, int xAge) {
		full = xFull;
		first = full.substring(0, full.indexOf(' '));
		last = full.substring(full.indexOf(' ') + 1);
		age = xAge;
	}

	public String getFull() {
		return full;
	}
	public String getFirst() {
		return first;
	}

	public String getLast() {
		return last;
	}

	public int getAge() {
		return age;
	}

	public boolean search(int xTerm, String xName, int xAge) {
		// true means it fits the criteria
		switch (xTerm) {
		case 1:
			if (xName.equals(first)) {
				return true;
			}
			return false;
		case 2:
			if (xName.equals(last)) {
				return true;
			}
			return false;
		case 3:
			if (xAge == age) {
				return true;
			}
			return false;
		default:
			return false;
		}
	}
}
