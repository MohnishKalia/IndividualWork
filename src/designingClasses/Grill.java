package designingClasses;

import java.util.ArrayList;
public class Grill {
	private int numTimesCooked;
	private int maxCapacity;
	private ArrayList<Burger> smokeyJoe;

	public Grill(int xCapacity) {
		smokeyJoe = new ArrayList<Burger>();
		if (smokeyJoe.size() == 0 && xCapacity > 0) {
			maxCapacity = xCapacity;
			numTimesCooked = 0;
		}
	}

	public boolean addBurger(Burger food) {
		if (smokeyJoe.size() + 1 <= maxCapacity) {
			return smokeyJoe.add(food);
		} else {
			return false;
		}
	}

	public void cook() {
		boolean flag = true;
		for (Burger temp : smokeyJoe) {
			if (flag) {
				flag = temp.isCooked();
			}
		}
		if (!flag) {
			for (Burger temp : smokeyJoe) {
				if (!temp.isCooked()) {
					temp.cookMe();
					numTimesCooked++;
				}
			}
		}
	}

	public int getTimesCooked() {
		return numTimesCooked;
	}

	public void serveBurgers() {
		for (int i = smokeyJoe.size() - 1; i >= 0; i--) {
			if (smokeyJoe.get(i).isCooked()) {
				smokeyJoe.remove(i);
			}
		}
	}

	public int getBurgers() {
		return smokeyJoe.size();
	}
}