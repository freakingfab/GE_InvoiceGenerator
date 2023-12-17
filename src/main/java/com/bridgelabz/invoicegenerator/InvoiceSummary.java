package com.bridgelabz.invoicegenerator;

/*
    @desc: provide invoice summary for all rides
 */
public class InvoiceSummary {
    private final int totalRides;
    private final double totalFare;
    private final double averageFare;

    /*
        @desc: constructor for class
        @params: totalRides, totalFare, averageFare
        @return: none
     */
    public InvoiceSummary(int totalRides, double totalFare, double averageFare) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
        this.averageFare = averageFare;
    }

    /*
        @desc: getters for class variables
     */
    public int getTotalRides() {
        return totalRides;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public double getAverageFare() {
        return averageFare;
    }
}

