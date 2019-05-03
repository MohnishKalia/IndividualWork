package interfaces;

import java.util.ArrayList;

public class TestFish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Fish> bowl = new ArrayList<Fish>();
		for (int i = 0; i < 4; i++) {
			bowl.add(new Trout());
			bowl.add(new Goldfish());
		}
		Trout oldestT = (Trout) bowl.get(0);
		Goldfish longestG = (Goldfish) bowl.get(1);
		
		for (Fish temp : bowl) {
			if (temp instanceof Goldfish && longestG.getLength() < temp.getLength())
				longestG = (Goldfish) temp;
			if (temp instanceof Trout && oldestT.getAge() < ((Trout) temp).getAge())
				oldestT = (Trout) temp;
		}
		System.out.println(longestG.getColor());
		System.out.println(oldestT.getScales());
	}
}
