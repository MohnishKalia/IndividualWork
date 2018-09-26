package mathOperators;
import java.util.Scanner;
public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double h = -99.0;
		double w = -101.4;
		double d = -54.4;
		double volume = -83.2;
		Scanner input = new Scanner(System.in);
		System.out.println("How high?");
		h = input.nextDouble();
		System.out.println("How wide?");
		w = input.nextDouble();
		System.out.println("How deep?");
		d = input.nextDouble();
		volume = (h*w*d);
		System.out.println("Your volume is " + volume);
		input.close();
	}

}
