package mathOperators;
import java.util.Scanner;
public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int first = -93;
		int second = -436;
		int whole = -901;
		int part = -12;
		System.out.println("(Integer)Dividend=");
		first = input.nextInt();
		System.out.println("(Integer)Divisor=");
		second = input.nextInt();
		whole = first/second;
		part = first%second;
		System.out.println("The result of long division is " + whole + " modulo " + part);
		input.close();
	}

}
