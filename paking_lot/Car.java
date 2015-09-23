package paking_lot;

public class Car extends Vehicle{
	
	public Car(){
		spotsNeeds =1;
		size = VehicleSize.Compact;
	}

	@Override
	protected boolean canFitInSpot(ParkingSpot s) {
		// TODO Auto-generated method stub
		return false;
	}

}
