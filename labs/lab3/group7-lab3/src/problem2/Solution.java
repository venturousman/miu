package problem2;

import java.util.List;

public class Solution {

	public static void main(String[] args) {
		Landlord lord1 = new Landlord();
		lord1.addBuilding(100);
		lord1.addBuilding(200);

		List<Building> buildings = lord1.getBuildings();
		for (Building building : buildings) {
			building.addApartment(123);
			building.addApartment(432);
		}

		double totalProfits = 0;
		for (Building building : buildings) {
			totalProfits += building.getProfit();
		}

		System.out.println("total profits = " + totalProfits);
	}

}
