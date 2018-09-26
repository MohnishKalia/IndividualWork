package inputExamples;
import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -444;
		int weight = -999;
		int luckyNumber = -4373;
		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		age = input.nextInt();
		System.out.println("How much do you weigh?");
		weight = input.nextInt();
		System.out.println("What is your lucky number?");
		luckyNumber = input.nextInt();
		System.out.println("In the future...\nI see...\n" + luckyNumber + " years from now...\nYou will reside at number " + age + weight  + " at the old folks home.");
		input.close();
	}

}
