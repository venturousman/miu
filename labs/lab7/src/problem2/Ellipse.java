package problem2;

public class Ellipse implements ClosedCurve {
	private double semiaxis;
	private double elateral;

	public Ellipse(double semiaxis, double elateral) {
		this.semiaxis = semiaxis;
		this.elateral = elateral;
	}

	@Override
	public double computePerimeter() {
		return 4 * semiaxis * elateral;
	}

	public double getSemiaxis() {
		return semiaxis;
	}

	public double getElateral() {
		return elateral;
	}

}
