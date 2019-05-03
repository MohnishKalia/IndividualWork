package designingClasses;

import java.util.ArrayList;
import java.util.Random;

public class TestpileOjunk {
	public static void main(String[] args) {
		Random gen = new Random();
		ArrayList<pileOjunk> junkyard = new ArrayList<pileOjunk>();
		int min = 10;
		int max = 100;
		for (int i = 0; i < 20; i++) {
			junkyard.add(new pileOjunk());
		}
		for (pileOjunk temp : junkyard) {
			temp.setRandom(min + gen.nextInt(max - min + 1));
		}
		System.out.println(junkyard.get(7).sum(3, 14));
	}
}