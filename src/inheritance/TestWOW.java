package inheritance;

import java.util.ArrayList;
public class TestWOW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Player> game = new ArrayList<Player>();
		for (int i = 0; i < 4; i++) {
			game.add(new Mage());
			game.add(new Rogue());
		}
		for (Player temp : game) {
			for (int i = 0; i < 14; i++)
				temp.move();
			System.out.println(temp.stats());
			System.out.println(((Object) temp).toString());
		}
	}

}
