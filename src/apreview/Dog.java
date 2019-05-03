package apreview;

public class Dog {
	private String name;
	private int friends;
	private int age;

	public Dog(String xName, int xFriends, int xAge) {
		name = xName;
		friends = xFriends >= 0 ? xFriends : 2;
		age = xAge >= 0 ? xAge : 7;
	}

	public String getName() {
		return name;
	}

	public int getFriends() {
		return friends;
	}

	public int getAge() {
		return age;
	}

}
