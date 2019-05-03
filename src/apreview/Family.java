package apreview;

import java.util.ArrayList;

public class Family {
	private ArrayList<Person> adults;
	private ArrayList<Person> children;

	public Family() {
		adults = new ArrayList<Person>();
		children = new ArrayList<Person>();
	}

	public void add(Person p) {
		if (p.getAge() >= 18) {
			adults.add(p);
		} else {
			children.add(p);
		}
	}

	public boolean isInFamily(Person other) {
		for (Person temp : adults)
			if (temp.matches(other))
				return true;
		for (Person temp : children)
			if (temp.matches(other))
				return true;
		return false;
	}
}
