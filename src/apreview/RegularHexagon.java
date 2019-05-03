package apreview;

import java.util.ArrayList;

public class RegularHexagon {
	private ArrayList<CoordinatePoint> points;

	public RegularHexagon(ArrayList<CoordinatePoint> pts) {
		points = pts;
	}

	public double getSideLength() {
		double x1 = points.get(0).getX();
		double y1 = points.get(0).getY();
		double x2 = points.get(1).getX();
		double y2 = points.get(1).getY();
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}

	public double getArea() {
		return (Math.pow(this.getSideLength(), 2) * 3 * Math.sqrt(3)) / 2;
	}

	public CoordinatePoint getCenter() {
		double x1 = points.get(0).getX();
		double y1 = points.get(0).getY();
		double x2 = points.get(1).getX();
		double y2 = points.get(1).getY();
		double x = (x1 + x2) / 2;
		double y = (y1 + y2) / 2;
		return new CoordinatePoint(x, y);
	}
}
