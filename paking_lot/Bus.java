package paking_lot;

public class Bus extends Vehicle {
	
	public Bus(){
		spotsNeeds = 5;
		size = VehicleSize.Large;
	}
	
	@Override
	protected boolean canFitInSpot(ParkingSpot s) {
		// TODO Auto-generated method stub
		return false;
	}

}
