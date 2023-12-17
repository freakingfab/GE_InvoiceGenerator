package com.bridgelabz.invoicegenerator;

/*
    @desc: enum for normal or premium
 */
public enum RideCategory {
    NORMAL(10.0, 1, 5.0),
    PREMIUM(15.0, 2, 20.0);

    private final double ratePerKm;
    private final int ratePerMinute;
    private final double minFare;

    /*
        @desc: constructor for variables
        @params: rateperKm, ratepermin, minfare
        @return: none
     */
    RideCategory(double ratePerKm, int ratePerMinute, double minFare) {
        this.ratePerKm = ratePerKm;
        this.ratePerMinute = ratePerMinute;
        this.minFare = minFare;
    }

    /*
        @desc: getters for variables
        @return: void
     */
    public double getRatePerKm() {
        return ratePerKm;
    }

    public int getRatePerMinute() {
        return ratePerMinute;
    }

    public double getMinFare() {
        return minFare;
    }
}
