package apreview;

public class Person {
	private String name;
	private int age;

	public Person(String myName, int myAge) {
		name = myName;
		age = myAge;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean matches(Person p) { /* to be implemented in part (a) */
		return (this.getName() == p.getName() && this.getAge() == p.getAge());
	}
}
