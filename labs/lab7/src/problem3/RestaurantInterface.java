package problem3;

public interface RestaurantInterface {
	String getRestaurantName();

	double calculateDeliveryCharge();

	static void printFormattedData(String restaurantName, String customerName, String loyalStatus, double orderAmount,
			double deliveryCharge, double discount, double totalAfterDiscount) {
		System.out.println("Processing order for Customer: " + customerName + " at Restaurant: " + restaurantName);
		System.out.println("Customer Loyalty Status: " + loyalStatus);
		System.out.println("Restaurant: " + restaurantName);
		System.out.println("Customer: " + customerName);
		System.out.printf("Order Amount: %.2f\n", orderAmount);
		System.out.printf("Delivery Charge: %.2f\n", deliveryCharge);
		System.out.printf("Discount Applied: %.2f\n", discount);
		System.out.printf("Total after Discount: %.2f\n\n\n", totalAfterDiscount);
	}

	default double calculateDiscount(double totalOrderAmount) {
		if (totalOrderAmount > 100)
			return (double) 5 / 100;
		return 0.0;
	}
}
