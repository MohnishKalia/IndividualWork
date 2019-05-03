package arrayList;

import java.util.ArrayList;
import java.util.Random;

import objectProgramming.Rectangle;
public class RectangleAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random(56);
		int min = 1;
		int max = 50;
		double most = 0;
		int deleterM = 0;
		int deleterL = 0;
		double least = 50 * 51;
		ArrayList<Rectangle> prism = new ArrayList<Rectangle>();

		for (int i = 0; i < 20; i++) {
			prism.add(new Rectangle(min + gen.nextInt(max - min + 1), min + gen.nextInt(max - min + 1)));
		}

		for (int j = 0; j < prism.size(); j++) {
			if (prism.get(j).area() > most) {
				most = prism.get(j).area();
				deleterM = j;
			}
			if (prism.get(j).area() < least) {
				least = prism.get(j).area();
				deleterL = j;
			}
		}
		prism.set(0, prism.get(deleterM));
		prism.set(19, prism.get(deleterL));

		System.out.println("Areas of the Rectangles:");
		for (int k = 0; k < prism.size(); k++) {
			System.out.println(prism.get(k).area());
		}
	}

}
