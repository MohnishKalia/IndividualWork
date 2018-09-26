package mathOperators;
import java.util.Scanner;
public class AgeIn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -800;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		age = age + 7;
		System.out.println("You will be " + age + " years old in 7 years.");
		input.close();
	}

}
