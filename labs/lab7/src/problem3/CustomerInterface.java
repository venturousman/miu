package problem3;

public interface CustomerInterface {
	default boolean isLoyaltyCustomer(int loyaltypoints) {
		if (loyaltypoints > 50)
			return true;
		return false;
	}

	String getCustomerName();

	int getLoyaltyPoints();
}
