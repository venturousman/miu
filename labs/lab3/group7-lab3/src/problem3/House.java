package problem3;

//public class House {
//	private double lotSize;
//	private Address address;
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public House(Address address, double lotSize) {
//		this.address = address;
//		this.lotSize = lotSize;
//	}
//
//	public double computeRent() {
//		return 0.1 * lotSize;
//	}
//}

public class House extends Property {
	private double lotSize;

	public House(Address address, double lotSize) {
		super(address);
		this.lotSize = lotSize;
	}

	@Override
	public double computeRent() {
		return 0.1 * lotSize;
	}
}
