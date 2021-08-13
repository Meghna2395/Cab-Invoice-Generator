package com.bridzelabz;

import java.util.List;

public class InvoiceGeneratorService {
	double totalFare = 0;
	
	public double calculateFare(double distance, int time) {
		double totalFare = (distance*10)+time*1;
		
		if (totalFare==0.0)
		return 0;
		else if (totalFare<5.0) {
			return 5.0;
		}
		
		return totalFare;
		
	}
	
	public double calculateFareForAllRides(List<Ride> rides) {
		for (Ride ride : rides) {
			totalFare += calculateFare(ride.getDistance(), ride.getTimeInMin());
		}
		
		return totalFare;
	}

}
