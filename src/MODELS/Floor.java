package MODELS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Floor {

	private int floorId;
	private List<Spot> spots;
	private Map<SpotType, Integer> availableSpots;
	private DisplayBoard display;
	
	public Floor(int floorId, DisplayBoard display) {
		// TODO Auto-generated constructor stub
		this.floorId = floorId;
		this.display = display;
		this.spots = new ArrayList<>();
		this.availableSpots = new HashMap<>();
	}
	
	public void addSpot(Spot spot) {
		// TODO Auto-generated method stub

		spots.add(spot);
	}
	
	public void updateAvailableSpots() {
		// TODO Auto-generated method stub
		for(Spot spot : spots) {
			if(!spot.isOccupied()) {
				availableSpots.put(spot.getType(), availableSpots.getOrDefault(spot.getType(), 0) + 1);
			}
		}
		
		updateDisplayBoard();
	}
	public void updateDisplayBoard() {
		// TODO Auto-generated method stub

		display.updateDisplayBoard(availableSpots);
	}
	
	public int getFloorId() {
		return floorId;
	}
	
	public Spot park(Vehicle vehicle) {
		// TODO Auto-generated method stub
		for(Spot spot : spots) {
			if(!spot.isOccupied() && spot.canFit(vehicle)) {
				spot.occupySpot();
				availableSpots.put(spot.getType(),  availableSpots.get(spot.getType()) - 1);
				updateDisplayBoard();
				return spot;
			}
		}
		
		return null;
	}
	
	public void unPark(Spot spot) {
		this.availableSpots.put(spot.getType(),  availableSpots.get(spot.getType()) + 1);
		updateDisplayBoard();
	}
}
