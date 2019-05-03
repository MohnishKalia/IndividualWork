package mathOperators;
import java.util.Scanner;
public class VotingElegibilty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -768;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		age = 18 - age;
		System.out.println("You will be able to vote in " + age + " years.");
		input.close();
	}

}
