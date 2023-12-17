package com.bridgelabz.invoicegenerator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    @desc: class for user with list of rides
 */
public class Users {
    private Map<Integer, List<Ride>> userRides;

    /*
        @desc: constructor for class
        @params: none
        @return: none
     */
    public Users() {
        this.userRides = new HashMap<>();
    }

    /*
       @desc: add rides to user id
       @params: user id, ride object list
       @return: void
     */
    public void addRides(int userId, List<Ride> rides) {
        userRides.put(userId, rides);
    }

    /*
        @desc: provides invoice for the user
        @params: userid
        @return: InvoiceSummary
     */
    public InvoiceSummary getInvoice(int userId) {
        List<Ride> rides = userRides.get(userId);
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        return invoiceGenerator.calculateFareForList(rides);
    }
}
