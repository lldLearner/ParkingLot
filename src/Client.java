import FACTORY.SpotFactory;
import FACTORY.VehicleFactory;
import MODELS.DisplayBoard;
import MODELS.EntryGate;
import MODELS.ExitGate;
import MODELS.Floor;
import MODELS.ParkingLot;
import MODELS.Spot;
import MODELS.SpotType;
import MODELS.Vehicle;
import MODELS.VehicleType;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParkingLot parkingLot = ParkingLot.getInstance(2);
		DisplayBoard b1 = new DisplayBoard(1);
		Floor f1 = new Floor(1, b1);
		
		parkingLot.addParkingFloor(f1);
		
		EntryGate eyg1 = new EntryGate("E1");
		ExitGate etg1 = new ExitGate();
		
		parkingLot.addEntryGate(eyg1);
		parkingLot.addExitGate(etg1);
		
		Spot s1 = SpotFactory.createParkingSpot("F1-1", SpotType.COMPACT);
		Spot s2 = SpotFactory.createParkingSpot("F1-2", SpotType.DISABLED);

		
		f1.addSpot(s1);
		f1.addSpot(s2);

		
		f1.updateAvailableSpots();
		
		Vehicle v1 = VehicleFactory.createVehicle("HR21F0647", VehicleType.CAR);
		Vehicle v2 = VehicleFactory.createVehicle("HR22F0647", VehicleType.TRUCK);
		Vehicle v3 = VehicleFactory.createVehicle("HR23F0647", VehicleType.VAN);

		eyg1.handleParkingRequest(v1, parkingLot);
		eyg1.handleParkingRequest(v2, parkingLot);
		eyg1.handleParkingRequest(v3, parkingLot);
	}

}
