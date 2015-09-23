package paking_lot;

public class Motorcycle extends Vehicle {
	
	public Motorcycle(){
		 spotsNeeds = 1;
		 size = VehicleSize.Motorcyle;
	}
	
	@Override
	public boolean canFitInSpot(ParkingSpot s){
		return false;
	}
}
