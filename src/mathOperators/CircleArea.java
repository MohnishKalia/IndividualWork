package mathOperators;
import java.util.Scanner;
public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radius = -93.4;
		double area = -436.1;
		System.out.println("What is the radius of the circle?");
		radius = input.nextDouble();
		area = (radius*radius)*Math.PI;
		System.out.println("The area of the circle is " + area);
		input.close();
	}

}
