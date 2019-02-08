package designingClasses;
import java.util.ArrayList;
import java.util.Scanner;
public class TestGreeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Greeter> jehova = new ArrayList<Greeter>();
		System.out.println("How many Greeters would you like to construct?");
		int bound = input.nextInt();
		input.nextLine();
		for (int i = 0; i < bound; i++) {
			jehova.add(new Greeter());
		}
		for (Greeter temp : jehova) {
			System.out.println(temp.displayInfo());
		}
		input.close();
	}

}
