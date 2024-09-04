package problem2;

public class Apartment {
	private double rent;
	private Building building;

	// package level
	Apartment(double rent, Building building) {
		this.rent = rent;
		this.building = building;
	}

	public double getRent() {
		return this.rent;
	}

	public Building getBuilding() {
		return this.building;
	}
}
