package objectProgramming;

import java.util.Scanner;
public class TestIsoTrapezoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsoTrapezoid bob = new IsoTrapezoid(11, 19, 3, 5);
		Scanner input = new Scanner(System.in);

		bob.perimeter();
		bob.area();

		input.close();
	}
}