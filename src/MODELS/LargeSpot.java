package MODELS;

public class LargeSpot extends Spot {

	public LargeSpot(String id) {
		super(id, SpotType.LARGE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canFit(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return vehicle.getSize() == VehicleSize.LARGE || vehicle.getSize() == VehicleSize.COMPACT
				|| vehicle.getSize() == VehicleSize.MOTORCYCLE;
	}

}
