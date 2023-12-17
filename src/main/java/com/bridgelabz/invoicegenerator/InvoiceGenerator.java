package com.bridgelabz.invoicegenerator;

import java.util.List;

/*

    @desc: class for providing service related to invoice
 */
public class InvoiceGenerator {


    /*
        @desc: calculating fare for a ride
        @params: distance, time
        @return: double
     */
    public double calculateFare(Ride ride){
        double fare = ride.getDistance()*(ride.getRideCategory().getRatePerKm()) + ride.getTime()*(ride.getRideCategory().getRatePerMinute());
        return Math.max(ride.getRideCategory().getMinFare(), fare);
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

