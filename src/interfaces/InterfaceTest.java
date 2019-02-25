package interfaces;

import java.util.ArrayList;
import java.util.Random;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkerStart[] comp = new WorkerStart[100];
		ArrayList<CatStart> nap = new ArrayList<CatStart>();
		Random gen = new Random();
		WorkerStart largeW, smallW;
		CatStart largeC, smallC;
		for (int i = 0; i < comp.length; i++) {
			comp[i] = new WorkerStart(gen.nextInt(40), 5 * gen.nextDouble());
		}
		largeW = comp[0];
		smallW = comp[0];
		for (WorkerStart temp : comp) {
			if (temp.compareTo(largeW) > 0)
				largeW = temp;
			if (temp.compareTo(smallW) < 0)
				smallW = temp;
		}
		System.out.println("The largest worker is " + largeW.toString());
		System.out.println("The smallest worker is " + smallW.toString());
		for (int i = 0; i < 100; i++) {
			nap.add(new CatStart(gen.nextInt(7), gen.nextInt(12)));
		}
		largeC = nap.get(0);
		smallC = nap.get(0);
		for (CatStart temp : nap) {
			if (temp.compareTo(largeC) > 0)
				largeC = temp;
			if (temp.compareTo(smallC) < 0)
				smallC = temp;
		}
		System.out.println("The largest cat is " + largeC.toString());
		System.out.println("The smallest cat is " + smallC.toString());
	}

}
