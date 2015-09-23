package paking_lot;
import java.util.*;


public abstract class Vehicle {
	protected VehicleSize size;
	protected int spotsNeeds;
	protected ArrayList<ParkingSpot> slots = new ArrayList<ParkingSpot>();
	
	public Vehicle() {};
	
	protected VehicleSize getSize(){
		return size;
	}
	
	protected int getSpotNeeds(){
		return spotsNeeds;
	}
	
	protected void parkIn(ParkingSpot s){
		slots.add(s);
	}
	
	protected void clearSpot(){
		
	}
	
	protected abstract boolean canFitInSpot(ParkingSpot s);
	
}


