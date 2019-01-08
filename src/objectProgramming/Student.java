package objectProgramming;

public class Student {
	private String name;
	private int score;

	public Student() {

	}
	public Student(String xName, int xScore) {
		name = xName;
		score = xScore;
	}

	public int returnScore() {
		return score;
	}

	public String returnName() {
		return name;
	}
}
