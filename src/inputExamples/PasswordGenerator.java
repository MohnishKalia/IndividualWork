package inputExamples;
import java.util.Scanner;
public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte one = -100;
		byte two = -100;
		byte three = -100;
		Scanner input = new Scanner(System.in);
		System.out.println("3-digit Password Generator:");
		System.out.println("Type the first one-digit number wish to include.");
		one = input.nextByte();
		System.out.println("Type the second one-digit number wish to include.");
		two = input.nextByte();
		System.out.println("Type the third one-digit number wish to include.");
		three = input.nextByte();
		System.out.println("All Possible Combinations:\n" + one + two + three + "\n" + one + three + two + "\n" + two + one + three );
		input.close();
	}

}
