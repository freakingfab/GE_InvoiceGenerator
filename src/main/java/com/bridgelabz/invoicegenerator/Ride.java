package com.bridgelabz.invoicegenerator;
/*
    @desc: create a ride object with travel distance and time
 */
public class Ride{
    private double distance;
    private int time;

    /*
        @desc: constructor for class
        @params: distance and time
        @return: none
     */
    public Ride(double distance, int time){
        this.distance = distance;
        this.time = time;
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
}
