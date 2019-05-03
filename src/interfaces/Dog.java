package interfaces;

public class Dog implements Animal {

	private String name;
	private int age;
	private boolean injured;

	public Dog() {
		name = "Fido";
		age = 0;
		injured = false;
	}

	public void act() {
		// TODO Auto-generated method stub
		injured = false;
		age += 7;
		if (Math.random() < 0.02)
			injured = true;
	}

	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Injured: " + injured;
	}

	public void vet() {
		injured = false;
	}
}
