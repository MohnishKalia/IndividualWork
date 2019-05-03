package designingClasses;

import java.util.Random;

public class pileOjunk {
	private static int idNumber = 1;
	private int myId;
	private Random gen;
	private int randomNum;

	public pileOjunk() {
		idNumber++;
		myId = idNumber;
		gen = new Random();
		randomNum = 10 + gen.nextInt(100 - 10 + 1);
	}

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

	public void setRandom(int randomNum) {
		this.randomNum = randomNum;
	}
}