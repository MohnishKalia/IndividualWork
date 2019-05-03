package designingClasses;
import java.util.Random;
import java.util.Scanner;
public class TestGrill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		Scanner input = new Scanner(System.in);
		int choice = 0;
		int min = 7;
		int max = 28;
		Grill bob = new Grill(min + gen.nextInt(max - min + 1));
		boolean flag = true;
		while (flag) {
			System.out.println("Choose:");
			System.out.println("1. Add an uncooked burger to the grill");
			System.out.println("2. Cook the burgers");
			System.out.println("3. Serve the burgers");
			System.out.println("4. Quit");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				Burger todd = new Burger();
				boolean temp = bob.addBurger(todd);
				System.out.println(temp);
				break;
			case 2:
				bob.cook();
				break;
			case 3:
				bob.serveBurgers();
				break;
			case 4:
				flag = false;
				System.out.println(bob.getTimesCooked() + " burgers have been cooked on this grill");
				break;
			default:
				System.out.println("Not a valid option, try again.");
				break;
			}
			System.out.println(bob.getBurgers() + " burgers so far");
		}
		input.close();
	}

}
