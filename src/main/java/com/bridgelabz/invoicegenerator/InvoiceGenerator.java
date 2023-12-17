package com.bridgelabz.invoicegenerator;

import java.util.List;

/*

    @desc: class for providing service related to invoice
 */
public class InvoiceGenerator {
    private static final double RATE_PER_KM = 10;
    private static final int RATE_PER_MIN = 1;

    private static final double MIN_FARE = 5;

    /*
        @desc: calculating fare for a ride
        @params: distance, time
        @return: double
     */
    public double calculateFare(Ride ride){
        double fare = ride.getDistance()*RATE_PER_KM + ride.getTime()*RATE_PER_MIN;
        return Math.max(MIN_FARE, fare);
    }

    /*
        @desc: calculate fare for list of rides
        @params: List<Ride>
        @return: Invoice Summary
     */
    public InvoiceSummary calculateFareForList(List<Ride> rides){
        double totalFare = rides.stream()
                .mapToDouble(ride -> calculateFare(ride))
                .sum();
        int totalRides = rides.size();
        double averageFare = totalFare / totalRides;
        return new InvoiceSummary(totalRides, totalFare, averageFare);
    }
}

