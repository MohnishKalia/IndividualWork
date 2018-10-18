package objectProgramming;

public class Cat {
	private int age;
	private int sleep;

	public Cat() {

	}

	public Cat(int xAge, int xSleep) {
		age = xAge;
		sleep = xSleep;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int xAge) {
		age = xAge;
	}

	public int getSleep() {
		return sleep;
	}

	public void setSleep(int xSleep) {
		sleep = xSleep;
	}
	public void birthday() {
		age += age;
	}
	public void sleepMore() {
		sleep += sleep;
	}

	public void sleepLess() {
		sleep -= sleep;
	}
}
