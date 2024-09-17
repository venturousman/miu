package problem3;

import java.util.ArrayList;

public class FoodDeliverySystem {

	public static void main(String[] args) {
		// Create an ArrayList of Restaurants
		ArrayList<Restaurant> restaurants = new ArrayList<>();
		restaurants.add(new Restaurant("Sushi Palace", 5.0, 10.0));
		restaurants.add(new Restaurant("Pizza Corner", 3.5, 5.0));
		restaurants.add(new Restaurant("Burger World", 4.0, 7.5));
		// Create an ArrayList of Customers
		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(new Customer("John Doe", 60));
		customers.add(new Customer("Jane Smith", 40));
		customers.add(new Customer("Bob Johnson", 80));
		// Print welcome message
		System.out.println("Welcome to the Food Delivery System!");

		double min = 50.0;
		double max = 200.0;

		for (Restaurant restaurant : restaurants) {
			double deliveryCharge = restaurant.calculateDeliveryCharge();

			for (Customer customer : customers) {
				// Generate a random double between 50 and 200
				double orderAmount = min + (max - min) * Math.random();
				double discount = restaurant.calculateDiscount(orderAmount);
				double totalAfterDiscount = orderAmount - discount;

				boolean isLoyalCustomer = customer.isLoyaltyCustomer(customer.getLoyaltyPoints());
				String loyalStatus = "New Customer";
				if (isLoyalCustomer)
					loyalStatus = "Loyal Customer";
				RestaurantInterface.printFormattedData(restaurant.getRestaurantName(), customer.getCustomerName(),
						loyalStatus, orderAmount, deliveryCharge, discount, totalAfterDiscount);
			}
		}
	}

}
