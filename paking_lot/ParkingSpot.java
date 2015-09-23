package paking_lot;

public class ParkingSpot {
	protected Level level;
	protected int num;
	protected int row;
	protected VehicleSize size;
	public boolean isAvailable =false;
	public ParkingSpot(Level lvl, int n, int r, VehicleSize s){
		level = lvl;
		num =  n;
		row = r;
		size = s;
	}
	
	public boolean isAvailble(){
		return isAvailable;
	}
	
	public boolean canFitIn(Vehicle v){
		return false;
	}
	
	public int getRow(){
		return row;
	}
	
	public int getNum(){
		return num;
	}
	
	public Level getLevel(){
		return level;
	}
	
	public void removeVehicle(){
		isAvailable = true;
	}
	
	public void parkIn(){
		isAvailable = false;
	}

}
