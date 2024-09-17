package problem2;

import java.util.Iterator;

public interface Polygon extends ClosedCurve {
	double[] getSides(); // to return the length of each side of the polygon in an array

	default double computePerimeter() {
		var sides = getSides();
		if (sides == null || sides.length == 0)
			return 0.0;
		double perimeter = 0.0;
		for (double side : sides) {
			perimeter += side;
		}
		return perimeter;
	}
}
