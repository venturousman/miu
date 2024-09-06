package problem3;

//public class Trailer {
//	private static final double RENT = 500;
//	private Address address;
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public Trailer(Address address) {
//		this.address = address;
//	}
//
//	public double computeRent() {
//		return RENT;
//	}
//}

public class Trailer extends Property {
	private static final double RENT = 500;

	public Trailer(Address address) {
		super(address);
	}

	@Override
	public double computeRent() {
		return RENT;
	}
}
