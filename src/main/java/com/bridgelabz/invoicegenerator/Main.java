package com.bridgelabz.invoicegenerator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Cab Invoice Generator");
        List<Ride> rides = Arrays.asList(new Ride(5.0, 10), new Ride(2.0, 5));
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        InvoiceSummary invoiceSummary = invoiceGenerator.calculateFareForList(rides);
        System.out.println("Total Rides: " + invoiceSummary.getTotalRides());
        System.out.println("Total Fare: " + invoiceSummary.getTotalFare());
        System.out.println("Average Fare: " + invoiceSummary.getAverageFare());
    }
}