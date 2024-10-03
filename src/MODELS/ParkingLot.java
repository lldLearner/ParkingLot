package MODELS;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

	private static ParkingLot instance;
	private List<Floor> parkingFloors;
	private List<EntryGate> entryGate;
	private List<ExitGate> exitGate;
	private int capacity;
	private int vehicleCount;
	private GroundDisplayBoard display;
	
	private ParkingLot(int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity = capacity;
		this.vehicleCount = 0;
		parkingFloors = new ArrayList<>();
		entryGate = new ArrayList<>();
		exitGate = new ArrayList<>();
		display = new GroundDisplayBoard();
	}
	
	public static ParkingLot getInstance(int capacity) {
		if(instance == null) {
			instance = new ParkingLot(capacity);
		}
		
		return instance;
	}
	
	public void addParkingFloor(Floor floor) {
		// TODO Auto-generated method stub
		parkingFloors.add(floor);
	}
	
	public void addEntryGate(EntryGate gate) {
		// TODO Auto-generated method stub
		entryGate.add(gate);
	}
	
	public void addExitGate(ExitGate gate) {
		// TODO Auto-generated method stub
		exitGate.add(gate);
	}
	
	public boolean isFull() {
		// TODO Auto-generated method stub

		return capacity == vehicleCount;
	}
	
	public boolean park(Vehicle vehicle) {
		if(isFull()) {
			display.update("parking is full!");
			return false;
		}
		
		for(Floor floor : parkingFloors) {
			if(floor.park(vehicle)) {
				vehicleCount++;
				return true;
			}
		}
		
		return false;
	}
}
