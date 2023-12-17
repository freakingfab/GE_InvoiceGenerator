package com.bridgelabz.invoicegenerator;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/*
    @desc: test file for Invoice generator
 */
public class InvoiceGeneratorTest {
    private InvoiceGenerator invoiceGenerator;

    /*
        @desc: function to initialise object for invoiceGenerator
        @params: none
        @return: void
     */
    @Before
    public void intialiseInvoiceGenerator(){
        invoiceGenerator = new InvoiceGenerator();
    }

    /*
        @desc: test for calculate fare for a ride
        @params: none
        @return: void
     */
    @Test
    public void calculateFareForDistanceAndTime() {
        Ride ride = new Ride(5.0, 10, RideCategory.NORMAL);
        double fare = invoiceGenerator.calculateFare(ride);
        assertEquals(60.0, fare, 0.0);
    }

    /*
        @desc: test for ride with minimum fare
        @params: none
        @return: void
     */
    @Test
    public void calculateMinimumFare() {
        Ride ride = new Ride(0.1, 1, RideCategory.NORMAL);
        double fare = invoiceGenerator.calculateFare(ride);
        assertEquals(5.0, fare, 0.0);
    }


    /*
       @desc: test for invoice summary of list of rides
       @params: none
       @return: void
    */
    @Test
    public void calculateInvoiceSummaryForMultipleRides() {
        List<Ride> rides = Arrays.asList(new Ride(5.0, 10, RideCategory.NORMAL), new Ride(2.0, 5, RideCategory.NORMAL));
        InvoiceSummary summary = invoiceGenerator.calculateFareForList(rides);
        assertEquals(2, summary.getTotalRides());
        assertEquals(85.0, summary.getTotalFare(), 0.0);
        assertEquals(42.5, summary.getAverageFare(), 0.0);
    }

    /*
        @desc: test for premium rides
        @params: none
        @return: void
     */
    @Test
    public void calculateInvoiceForPremiumRides() {
        Users users = new Users();
        List<Ride> premiumRides = Arrays.asList(new Ride(5.0, 10, RideCategory.PREMIUM), new Ride(2.0, 5, RideCategory.PREMIUM));
        users.addRides(1, premiumRides);

        InvoiceSummary summary = users.getInvoice(1);
        assertEquals(2, summary.getTotalRides());
        assertEquals(135.0, summary.getTotalFare(), 0.0);
        assertEquals(67.5, summary.getAverageFare(), 0.0);
    }
}
