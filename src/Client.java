import FACTORY.SpotFactory;
import FACTORY.VehicleFactory;
import MODELS.DisplayBoard;
import MODELS.EntryGate;
import MODELS.ExitGate;
import MODELS.Floor;
import MODELS.ParkingLot;
import MODELS.Spot;
import MODELS.SpotType;
import MODELS.Ticket;
import MODELS.Vehicle;
import MODELS.VehicleType;
import STRATEGY.Cash;
import STRATEGY.UPI;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ParkingLot parkingLot = ParkingLot.getInstance(4);
		DisplayBoard b1 = new DisplayBoard(1);
		Floor f1 = new Floor(1, b1);
		
		DisplayBoard b2 = new DisplayBoard(2);
		Floor f2 = new Floor(2, b2);
		
		parkingLot.addParkingFloor(f1);
		parkingLot.addParkingFloor(f2);
		
		EntryGate eyg1 = new EntryGate("EYG1");
		ExitGate etg1 = new ExitGate("ETG1");

		parkingLot.addEntryGate(eyg1);
		parkingLot.addExitGate(etg1);

		Spot s1 = SpotFactory.createParkingSpot("F1-1", SpotType.COMPACT);
		Spot s2 = SpotFactory.createParkingSpot("F1-2", SpotType.DISABLED);
		Spot s3 = SpotFactory.createParkingSpot("F2-1", SpotType.COMPACT);
		Spot s4 = SpotFactory.createParkingSpot("F2-2", SpotType.DISABLED);
		f1.addSpot(s1);
		f1.addSpot(s2);	
		f2.addSpot(s3);
		f2.addSpot(s4);
		
		f1.updateAvailableSpots();
		f2.updateAvailableSpots();

		Vehicle v1 = VehicleFactory.createVehicle("HR21F0647", VehicleType.CAR);
		Vehicle v2 = VehicleFactory.createVehicle("HR22F0647", VehicleType.TRUCK);
		Vehicle v3 = VehicleFactory.createVehicle("HR23F0647", VehicleType.VAN);

		Ticket t1 = eyg1.handleParkingRequest(v1, parkingLot);
		Ticket t2 = eyg1.handleParkingRequest(v2, parkingLot);
		Ticket t3 = eyg1.handleParkingRequest(v3, parkingLot);

		Thread.sleep(2000);
		etg1.handlePaymentRequest(parkingLot, new UPI(), t1);
		etg1.handlePaymentRequest(parkingLot, new Cash(), t2);
	}
}
