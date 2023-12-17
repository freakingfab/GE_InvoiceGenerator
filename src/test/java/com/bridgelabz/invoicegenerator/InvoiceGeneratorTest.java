package com.bridgelabz.invoicegenerator;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

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
        Ride ride = new Ride(5.0, 10);
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
        Ride ride = new Ride(0.1, 1);
        double fare = invoiceGenerator.calculateFare(ride);
        assertEquals(5.0, fare, 0.0);
    }

    /*
        @desc: test for list of rides
        @params: none
        @return: void
     */
    @Test
    public void calculateFareForMultipleRides() {
        List<Ride> rides = Arrays.asList(new Ride(5.0, 10), new Ride(2.0, 5));
        double fare = invoiceGenerator.calculateFareForList(rides);
        assertEquals(85.0,fare,0.0);
    }

    /*
        @desc: test for no rides
        @params: none
        @return: void
     */
    @Test
    public void calculateInvoiceSummaryForNoRides(){
        List<Ride> rides = Arrays.asList();
        double fare = invoiceGenerator.calculateFareForList(rides);
        assertEquals(0.0,fare,0.0);
    }

}
