package inputExamples;
import java.util.Scanner;
public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean vote = true;
		System.out.println("Did you vote?");
		vote = input.nextBoolean();
		System.out.println("Voting status: " + vote);
	}

}
