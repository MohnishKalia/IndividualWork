package interfaces;

public class Student implements Person {
	private String name;

	private int studentAge;

	private String bestFriend;

	private int absent;

	private double gpa;

	public Student() {
		name = "Sam Jones";
		studentAge = 15;
		bestFriend = "Bob Smith";
		absent = 0;
		gpa = 0.0;
	}

	public void setName(String xName) {
		name = xName;
	}

	public int getAge() {
		return studentAge;
	}

	public String getName() {

		return name;
	}

	public int getAabsent() {
		return absent;
	}

	public void outSick() {
		absent++;
	}

	public String toString() {
		return "Student: " + name + " " + studentAge + " " + bestFriend + " " + absent + " " + gpa;

	}
}
