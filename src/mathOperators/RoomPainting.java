package mathOperators;
import java.util.Scanner;
public class RoomPainting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double width;
		double length;
		double area;
		int gallons;
		System.out.println("What is the width of the room (ft)?");
		width = input.nextDouble();
		System.out.println("What is the length of the room (ft)?");
		length = input.nextDouble();
		area = 16.0*width + 16.0*length;
		gallons = (int)Math.ceil(area/150);
		System.out.println("Dimensions of the room: " + width + " by " + length + " by 8");
		System.out.println("Area to paint: " + area + " square feet");
		System.out.println("Gallons needed to paint walls: " + gallons);
		input.close();
	}

}
