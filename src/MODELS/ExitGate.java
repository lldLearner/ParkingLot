package MODELS;

import java.time.ZoneId;
import java.util.Date;

import STRATEGY.PaymentStrategy;

public class ExitGate {

	private String gateNum;
	
	public ExitGate(String gateNum) {
		// TODO Auto-generated constructor stub
		this.gateNum = gateNum;
	}
	
	public void handlePaymentRequest(ParkingLot parkingLot, PaymentStrategy paymentStrategy, Ticket ticket) {
		// TODO Auto-generated method stub
		parkingLot.unpark(ticket.getFloor(), ticket.getSpot());
		
		Date currentDate = new Date();
		int hours = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().getSecond()  - ticket.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime().getSecond() ;
		int amount = hours * 100;
		paymentStrategy.pay(amount);
	}
}
