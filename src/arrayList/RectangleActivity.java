package arrayList;

import java.util.ArrayList;
import java.util.Random;

import objectProgramming.Rectangle;
public class RectangleActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		int min = 50;
		int max = 70;
		final int number = 400;
		ArrayList<Rectangle> prism = new ArrayList<Rectangle>();
		for (int i = 0; i < number; i++) {
			Rectangle temp = new Rectangle(min + gen.nextInt(max - min + 1), min + gen.nextInt(max - min + 1));
			prism.add(temp);
		}
		Rectangle last = prism.remove(prism.size() - 1);
		prism.set(0, last);
		for (int j = prism.size() - 1; j >= 0; j--) {
			System.out.println(prism.get(j).area() + " @ index " + j);
		}
	}

}
