package com.bridgelabz.invoicegenerator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Cab Invoice Generator");
        Users users = new Users();
        List<Ride> user1Rides = Arrays.asList(new Ride(5.0, 10,RideCategory.NORMAL), new Ride(2.0, 5,RideCategory.NORMAL));
        users.addRides(1, user1Rides);

        List<Ride> user2Rides = Arrays.asList(new Ride(3.0, 8, RideCategory.PREMIUM), new Ride(4.0, 15, RideCategory.PREMIUM));
        users.addRides(2, user2Rides);

        InvoiceSummary user1Invoice = users.getInvoice(1);
        System.out.println("User 1 Invoice Summary:");
        System.out.println("Total Rides: " + user1Invoice.getTotalRides());
        System.out.println("Total Fare: " + user1Invoice.getTotalFare());
        System.out.println("Average Fare: " + user1Invoice.getAverageFare());

        // Calculate invoice for User 2
        InvoiceSummary user2Invoice = users.getInvoice(2);
        System.out.println("\nUser 2 Invoice Summary:");
        System.out.println("Total Rides: " + user2Invoice.getTotalRides());
        System.out.println("Total Fare: " + user2Invoice.getTotalFare());
        System.out.println("Average Fare: " + user2Invoice.getAverageFare());
    }
}