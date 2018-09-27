package mathOperators;
import java.util.Scanner;
public class SphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radius = -93.4;
		double volume = -436.1;
		System.out.println("What is the radius of the sphere?");
		radius = input.nextDouble();
		volume = (radius*radius*radius)*Math.PI*(4.0/3.0);
		System.out.println("The volume of the circle is " + volume);
		input.close();
	}

}
