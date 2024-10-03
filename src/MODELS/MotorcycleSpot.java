package MODELS;

public class MotorcycleSpot extends Spot {

	public MotorcycleSpot(String id) {
		super(id, SpotType.MOTORCYCLE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canFit(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return vehicle.getSize() == VehicleSize.MOTORCYCLE;
	}

}
