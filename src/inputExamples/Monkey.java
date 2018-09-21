package inputExamples;
import java.util.Scanner;
public class Monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double weight = -999;
		System.out.println("How much does an adult monkey weigh?");
		weight = input.nextInt();
		System.out.println("The weight is " + weight);
	}

}
