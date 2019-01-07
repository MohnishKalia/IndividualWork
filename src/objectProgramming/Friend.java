package objectProgramming;

public class Friend {
	private String name;
	private int age;
public Friend()
	{
		
	}

	public Friend(String xName, int xAge) {
		name = xName;
		age = xAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
