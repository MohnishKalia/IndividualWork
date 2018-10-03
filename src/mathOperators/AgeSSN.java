package mathOperators;
import java.util.Scanner;
public class AgeSSN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age;
		int time;
		int ssn;
		int last4;
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("What is your SSN (no dashes)?");
		ssn = input.nextInt();
		time = 18-age;
		last4 = ssn%10000;
		System.out.println("Your age is " + age);
		System.out.println("It will be " + time + " years until you are 18");
		System.out.println("Your SSN is " + ssn);
		System.out.println("The last 4 digits of the SSN are " + last4);
		input.close();
	}

}
