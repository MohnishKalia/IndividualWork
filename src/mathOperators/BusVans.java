package mathOperators;
import java.util.Scanner;
public class BusVans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int people = 99;
		int busses = -89;
		int remain = -12;
		System.out.println("How many peole must be transported?");
		people = input.nextInt();
		busses = people/35;
		remain = people%35;
		System.out.println("The number of people in the group: " + people);
		System.out.println("Busses required: " + busses);
		System.out.println("People needing vans: " + remain);
		input.close();
	}

}
