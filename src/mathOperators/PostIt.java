package mathOperators;
import java.util.Scanner;
public class PostIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double base = -67.2;
		double height = -23.8;
		int post = -21;
		System.out.println("What is the base of the surface in inches?");
		base = input.nextDouble();
		System.out.println("What is the height of the surface in inches?");
		height = input.nextDouble();
		post = (int) Math.ceil((base*height)/9.0);
		System.out.println("For an area of " + base*height + " square inches...");
		System.out.println("You will need " + post + " post its to cover the surface.");
		input.close();
	}

}
