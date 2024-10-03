package MODELS;

import java.util.Date;

public class Ticket {

	private Vehicle vehicle;
	private Date date;
	private String ticketNumber;
	private Floor floor;
	private Spot spot;
	
	public Ticket(String ticketNumber, Vehicle vehicle, Floor floor, Spot spot) {
		// TODO Auto-generated constructor stub
		this.ticketNumber = ticketNumber;
		this.vehicle = vehicle;
		this.date = new Date();
		this.floor = floor;
		this.spot = spot;
	}

	public Date getDate() {
		return date;
	}

	public Floor getFloor() {
		// TODO Auto-generated method stub
		return floor;
	}

	public Spot getSpot() {
		// TODO Auto-generated method stub
		return spot;
	}	
}
