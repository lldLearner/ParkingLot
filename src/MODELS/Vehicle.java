package MODELS;

public class Vehicle {

	private String licensePlate;
	private VehicleType type;
	private VehicleSize size;

	public Vehicle(String licensePlate, VehicleType type, VehicleSize size) {
		// TODO Auto-generated constructor stub
		this.licensePlate = licensePlate;
		this.type = type;
		this.size = size;
	}
	
	public String getLicensePlate() {
		return licensePlate;
	}
	
	public VehicleType getType() {
		return type;
	}
	
	public VehicleSize getSize() {
		return size;
	}
}
