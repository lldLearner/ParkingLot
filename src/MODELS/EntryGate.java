package MODELS;

public class EntryGate {

	private String gateNum;

	public EntryGate(String gateNum) {
		// TODO Auto-generated constructor stub
		this.gateNum = gateNum;
	}
	
	public Ticket handleParkingRequest(Vehicle vehicle, ParkingLot parkingLot) {
		// TODO Auto-generated method stub
		if(!parkingLot.park(vehicle)) {
			return null;
		}
		
		return getTicket(vehicle);
	}

	private Ticket getTicket(Vehicle vehicle) {
		// TODO Auto-generated method stub
		String ticketNumber = "TICKET - " + vehicle.getLicensePlate();
		return new Ticket(ticketNumber, vehicle);
	}

	public String getGateNum() {
		return gateNum;
	}
}
