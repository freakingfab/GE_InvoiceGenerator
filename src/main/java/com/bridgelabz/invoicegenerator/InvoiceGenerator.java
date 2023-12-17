package com.bridgelabz.invoicegenerator;
/*

    @desc: class for providing service related to invoice
 */
public class InvoiceGenerator {
    private static double RATE_PER_KM = 10;
    private static int RATE_PER_MIN = 1;

    private static double MIN_FARE = 5;

    /*
        @desc: calculating fare for a ride
        @params: distance, time
        @return: double
     */
    public double calculateFare(Ride ride){
        double fare = ride.getDistance()*RATE_PER_KM + ride.getTime()*RATE_PER_MIN;
        return Math.max(MIN_FARE, fare);
    }
}

