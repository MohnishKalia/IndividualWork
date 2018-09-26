package inputExamples;
import java.util.Scanner;
public class LockerCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte one = -100;
		byte two = -100;
		byte three = -100;
		Scanner input = new Scanner(System.in);
		System.out.println("Locker Combination Generator:");
		System.out.println("Type the first set numbers wish to include.");
		one = input.nextByte();
		System.out.println("Type the second set of numbers wish to include.");
		two = input.nextByte();
		System.out.println("Type the third set of numbers wish to include.");
		three = input.nextByte();
		System.out.println("Your locker combination is: " + one + "-" + two + "-" + three);
		input.close();
	}

}
