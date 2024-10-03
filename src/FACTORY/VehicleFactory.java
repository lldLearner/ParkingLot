package FACTORY;

import MODELS.Car;
import MODELS.Motorcycle;
import MODELS.Truck;
import MODELS.Van;
import MODELS.Vehicle;
import MODELS.VehicleType;

public class VehicleFactory {

	public static Vehicle createVehicle(String licensePlate, VehicleType type) {
		// TODO Auto-generated method stub

		switch (type) {
		case CAR: {

			return new Car(licensePlate);
		}
		case TRUCK: {

			return new Truck(licensePlate);
		}
		case VAN: {

			return new Van(licensePlate);
		}
		case MOTORCYCLE: {

			return new Motorcycle(licensePlate);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}
}
