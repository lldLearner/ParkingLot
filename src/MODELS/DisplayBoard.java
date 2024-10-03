package MODELS;

import java.util.Map;

public class DisplayBoard {

	private int floorNumber;
	
	public DisplayBoard(int floorNumber) {
		// TODO Auto-generated constructor stub
		this.floorNumber = floorNumber;
	}
	public void updateDisplayBoard(Map<SpotType, Integer> availableSpots) {
		// TODO Auto-generated method stub

		System.out.println("The available spot type on " + this.floorNumber + " floor are " + availableSpots);
	}
}
