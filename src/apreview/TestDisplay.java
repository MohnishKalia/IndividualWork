package apreview;

import java.util.ArrayList;
import java.util.Random;

public class TestDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		ArrayList<Display> multi = new ArrayList<Display>();
		for (int i = 0; i < 7; i++) {
			multi.add(new TV(gen.nextInt(7), gen.nextBoolean()));
			multi.add(new Projector());
		}
		for (Display temp : multi) {
			temp.watch(gen.nextInt(21));
			if (temp instanceof TV && temp.toString().contains("true"))
				((TV) temp).changeBrightness();
			temp.watch(gen.nextInt(21));
			System.out.println(temp.toString());
		}
	}

}
