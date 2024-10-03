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
		if (instance == null) {
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

	public Ticket park(Vehicle vehicle) {
		if (isFull()) {
			display.update("parking is full!");
			return null;
		}

		for (Floor floor : parkingFloors) {
			Spot spot = floor.park(vehicle);
			if (spot != null) {
				System.out.println("Vehicle with license plate number " + vehicle.getLicensePlate()
						+ " is parked on floor " + floor.getFloorId() + " and spot " + spot.getId());
				vehicleCount++;
				return new Ticket("Ticket - " + vehicle.getLicensePlate(), vehicle, floor, spot);
			}
		}

		return null;
	}

	public void unpark(Floor floor, Spot spot) {
		// TODO Auto-generated method stub
		vehicleCount--;
		floor.unPark(spot);

	}
}
