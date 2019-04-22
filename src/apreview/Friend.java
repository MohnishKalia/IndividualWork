package apreview;

public class Friend {
	private String name;
	private int age;

	Friend(String newName, int newAge) {
		name = newName;
		age = newAge >= 0 ? newAge : 30;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setAge(int newAge) {
		age = newAge >= 0 ? newAge : 35;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
