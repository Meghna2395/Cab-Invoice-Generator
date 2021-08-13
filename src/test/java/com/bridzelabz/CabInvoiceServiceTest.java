package com.bridzelabz;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceServiceTest {
	
	InvoiceGeneratorService iService = new InvoiceGeneratorService();
	
	@Test
	public void testCalculateFare() {
		final double distance = 50;
		final int time = 30;
		
		double fare = iService.calculateFare(distance, time);
		assertEquals(530,fare,0);
	}
	
	@Test
	public void testcalculateFareForAllRides() {
		List<Ride> rides = new ArrayList<Ride>();
		Ride ride = new Ride(30,5);
		Ride ride2 = new Ride(100,5);
		
		rides.add(ride);
		rides.add(ride2);
		
		double totalFare = iService.calculateFareForAllRides(rides);
		assertEquals(1310, totalFare, 0);
				
	}

}
