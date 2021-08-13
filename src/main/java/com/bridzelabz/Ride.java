package com.bridzelabz;

public class Ride {
	public double distance;
	
	public int timeInMin;
	
	public Ride(double distance, int timeInMin){
		super();
		this.distance = distance;
		this.timeInMin = timeInMin;
		
		
		
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getTimeInMin() {
		return timeInMin;
	}

	public void setTimeInMin(int timeInMin) {
		this.timeInMin = timeInMin;
	}

}
