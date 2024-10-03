package MODELS;

public class CompactSpot extends Spot {

	public CompactSpot(String id) {
		super(id, SpotType.COMPACT);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canFit(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return VehicleSize.COMPACT == vehicle.getSize() || VehicleSize.MOTORCYCLE == vehicle.getSize();
	}

}
