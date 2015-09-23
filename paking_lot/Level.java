package paking_lot;

public class Level {
	protected int floor;
	protected int spotsNumbers;
	protected int availableSpots = 0;
	protected ParkingSpot[] spots;
	protected final int SPOTS_PER_ROW = 10;

	public Level(int flr, int spotsNum){
		floor = flr;
		spotsNumbers = spotsNum;
	}
	
	public int availableSpots(){
		return availableSpots;
	}
	
	public boolean parkVehicle(Vehicle vehicle){
		return false;
	}
	
	public boolean parkStartingAtSpats(int num, Vehicle v){
		return false;
	}
	
	public int findAvailableSpots(Vehicle v){ return 0;}
	
	public void spotFree(){
		availableSpots++;
	}
	
	
	
}
