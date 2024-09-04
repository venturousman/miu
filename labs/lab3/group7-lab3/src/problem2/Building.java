package problem2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private List<Apartment> apartments;
	private double maintenanceCost;
	private Landlord landlord;

	// package level
	Building(double maintenanceCost, Landlord landlord) {
		this.maintenanceCost = maintenanceCost;
		this.apartments = new ArrayList<Apartment>();
		this.landlord = landlord;
	}

	public List<Apartment> getApartments() {
		return this.apartments;
	}

	public double getMaintenanceCost() {
		return this.maintenanceCost;
	}

	public double getProfit() {
		double sum = 0;
		for (Apartment apartment : apartments) {
			sum += apartment.getRent();
		}
		return sum - this.maintenanceCost;
	}

	public Landlord getLandlord() {
		return this.landlord;
	}

	public void addApartment(double rent) {
		Apartment newApartment = new Apartment(rent, this);
		this.apartments.add(newApartment);
	}
}
