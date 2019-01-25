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

	public void addScore(int testScore) {
		if (testScore >= 0 && testScore <= 100)
		scores.add(testScore);
	}

	public double averageScore() {
		double sum = 0;
		for (int temp : scores) {
			sum += temp;
		}
		return sum / scores.size();
	}

	public int lowestScore() {
		int lowest = 999;
		for (int temp : scores) {
			if (temp < lowest) {
				lowest = temp;
			}
		}
		return lowest;
	}

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

	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}
}
