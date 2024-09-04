package problem2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
	private List<Building> buildings;

	public Landlord() {
		this.buildings = new ArrayList<Building>();
	}

	public List<Building> getBuildings() {
		return this.buildings;
	}

	public void addBuilding(double maintenanceCost) {
		Building newBuilding = new Building(maintenanceCost, this);
		buildings.add(newBuilding);
	}
}
