package arrays;

public class LongAndShort {
	private String full;
	private String first;
	private String last;

	public LongAndShort(String xFull) {
		full = xFull;
		first = full.substring(0, full.indexOf(' '));
		last = full.substring(full.indexOf(' ') + 1);
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

}
