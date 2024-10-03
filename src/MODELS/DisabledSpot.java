package MODELS;

public class DisabledSpot extends Spot {

	public DisabledSpot(String id) {
		super(id, SpotType.DISABLED);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canFit(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return true;
	}

}
