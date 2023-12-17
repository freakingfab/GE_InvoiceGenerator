package com.bridgelabz.invoicegenerator;
/*
    @desc: create a ride object with travel distance and time
 */
public class Ride{
    private double distance;
    private int time;

    private RideCategory rideCategory;

    /*
        @desc: constructor for class
        @params: distance and time
        @return: none
     */
    public Ride(double distance, int time, RideCategory rideCategory){
        this.distance = distance;
        this.time = time;
        this.rideCategory = rideCategory;
    }

    /*
        @desc: getter for distance
        @params: none
        @return: double
     */
    public double getDistance(){
        return distance;
    }

    /*
        @desc: getter for time
        @params: none
        @return: int
     */
    public int getTime() {
        return time;
    }

    /*
        @desc: getter for ride category
        @parasm: none
        @return: ridecategory
     */
    public RideCategory getRideCategory(){
        return rideCategory;
    }
}
