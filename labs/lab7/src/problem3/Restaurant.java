package problem3;

public class Restaurant implements RestaurantInterface {
	private String restaurantName;
	private double baseDeliveryCharge;
	private double locationDistance;

	public Restaurant(String restaurantName, double baseDeliveryCharge, double locationDistance) {
		this.restaurantName = restaurantName;
		this.baseDeliveryCharge = baseDeliveryCharge;
		this.locationDistance = locationDistance;
	}

	@Override
	public String getRestaurantName() {
		return this.restaurantName;
	}

	@Override
	public double calculateDeliveryCharge() {
		return baseDeliveryCharge + (locationDistance * 0.05);
	}

	public double getLocationDistance() {
		return locationDistance;
	}

	public double getBaseDeliveryCharge() {
		return baseDeliveryCharge;
	}

}
