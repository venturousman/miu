package problem2;

public class EquilateralTriangle implements Polygon {
	// an equilateral triangle is a triangle in which all side lengths are equal
	private double side;

	public EquilateralTriangle(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

//	@Override
//	public double computePerimeter() {
//		return 0;
//	}

	@Override
	public double[] getSides() {
		return new double[] { side };
	}
}
