package designingClasses;
import java.util.ArrayList;
public class Student {
	private String name;
	private ArrayList<Integer> scores;

	public Student() {
		scores = new ArrayList<Integer>();
	}

	public Student(String xName) {
		name = xName;
		scores = new ArrayList<Integer>();
	}

	/**
	 * Appends the score on the end of the arrayList test record.
	 * 
	 * @param testScore int score on the last test
	 */
	public void addScore(int testScore) {
		if (testScore >= 0 && testScore <= 100)
		scores.add(testScore);
	}

	/**
	 * Calculates the average score of a test record.
	 * 
	 * @return the total average score over all elements in the arrayList
	 */
	public double averageScore() {
		double sum = 0;
		for (int temp : scores) {
			sum += temp;
		}
		return sum / scores.size();
	}

	/**
	 * Finds the lowest test score within a test record.
	 * 
	 * @return the lowest test score in the arrayList
	 */
	public int lowestScore() {
		int lowest = 999;
		for (int temp : scores) {
			if (temp < lowest) {
				lowest = temp;
			}
		}
		return lowest;
	}

	/**
	 * Checks for absolute similarity between an object and the student.
	 * 
	 * @param Object given object for comparison
	 */
	public boolean equals(Object e) {
		try {
			if (e == this.clone())
				return true;
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}

	/**
	 * Converts unique identifiers of the object into a string.
	 * 
	 * @return String code of the object
	 */
	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
}
