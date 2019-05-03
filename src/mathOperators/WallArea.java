package mathOperators;
import java.util.Scanner;
public class WallArea {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length = -89.0;
		final double height = 8.0;
		double area = -85.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the wall? (ft, decimal answers)");
		length = input.nextDouble();
		area = length * height;
		System.out.println("The area of the wall is " + area);
		input.close();
	}

}
