package com.bridzelabz;

import static org.junit.Assert.assertEquals;

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

}
