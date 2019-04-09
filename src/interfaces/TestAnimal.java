package interfaces;
import java.util.ArrayList;
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> kingdom = new ArrayList<Animal>();
		for (int i = 0; i < 3; i++) {
			kingdom.add(new Dog());
			kingdom.add(new Cat());
		}
		for (Animal temp : kingdom) {
			temp.act();
			System.out.println(temp.toString());
			if (temp instanceof Dog)
				((Dog) temp).vet();
		}
		for (int i = kingdom.size() - 1; i >= 0; i--) {
			Animal temp = kingdom.get(i);
			if (temp instanceof Cat && !((Cat) temp).returnFriendly()) {
				kingdom.remove(i);
				break;
			}
		}
		System.out.println("-------------------------------------");
		for (Animal temp : kingdom) {
			System.out.println(temp.toString());
		}
	}

}
