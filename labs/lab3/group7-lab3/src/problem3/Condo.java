package problem3;

//public class Condo {
//	private Address address;
//	private int numberOfFloors;
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public Condo(Address address, int numberOfFloors) {
//		this.address = address;
//		this.numberOfFloors = numberOfFloors;
//	}
//
//	public double computeRent() {
//		return 500 * numberOfFloors;
//	}
//}

public class Condo extends Property {
	private int numberOfFloors;

	public Condo(Address address, int numberOfFloors) {
		super(address);
		this.numberOfFloors = numberOfFloors;
	}

	@Override
	public double computeRent() {
		return 500 * numberOfFloors;
	}
}
