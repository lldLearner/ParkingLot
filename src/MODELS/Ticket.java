package MODELS;

import java.util.Date;

public class Ticket {

	private Vehicle vehicle;
	private Date date;
	private String ticketNumber;
	
	public Ticket(String ticketNumber, Vehicle vehicle) {
		// TODO Auto-generated constructor stub
		this.ticketNumber = ticketNumber;
		this.vehicle = vehicle;
		this.date = new Date();
	}
}
