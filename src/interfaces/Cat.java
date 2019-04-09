package interfaces;

public class Cat implements Animal {

	private String name;
	private int age;
	private boolean friendly;

	public Cat() {
		name = "Bubbles";
		age = 0;
		friendly = (Math.random() < 0.5);
	}

	public void act() {
		// TODO Auto-generated method stub
		age += 9;
		friendly = !friendly;
	}

	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Friendly: " + friendly;
	}

	public boolean returnFriendly() {
		return friendly;
	}

}
