package mathOperators;
import java.util.Scanner;
public class CuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double length;
		double width;
		double radius;
		double area;
		double cost;
		System.out.println("What is the width of the lawn in yards?");
		width = input.nextDouble();
		System.out.println("What is the length of the lawn in yards?");
		length = input.nextDouble();
		System.out.println("What is the radius of the fountain in feet?");
		radius = input.nextDouble();
		area = (width*3)*(length*3) - Math.pow(radius,2)*Math.PI;
		cost = 1.25*(Math.floor(area)/100);
		System.out.println("For " + area + " square feet of lawn, the cost is $" + cost);
		input.close();
	}

}
