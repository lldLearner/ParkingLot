package MODELS;

public class EntryGate {

	private String gateNum;

	public EntryGate(String gateNum) {
		// TODO Auto-generated constructor stub
		this.gateNum = gateNum;
	}
	
	public Ticket handleParkingRequest(Vehicle vehicle, ParkingLot parkingLot) {
		// TODO Auto-generated method stub
		Ticket ticket = parkingLot.park(vehicle);
		return ticket;
	}

	public String getGateNum() {
		return gateNum;
	}
}
