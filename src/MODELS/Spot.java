package MODELS;

public abstract class Spot {

	private String id;
	private SpotType type;
	private boolean isOccupied;
	
	public Spot(String id, SpotType type) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.type = type;
		this.isOccupied = false;
	}
	
	public boolean isOccupied() {
		return isOccupied;
	}
	
	public void occupySpot() {
		// TODO Auto-generated method stub
		isOccupied = true;
	}
	
	public void freeSpot() {
		// TODO Auto-generated method stub
		isOccupied = false;
	}
	
	public SpotType getType() {
		return type;
	}
	
	public String getId() {
		return id;
	}
	
	abstract public boolean canFit(Vehicle vehicle);
}
