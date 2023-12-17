package com.bridgelabz.invoicegenerator;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Cab Invoice Generator");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance for ride: ");
        double distance = scanner.nextDouble();
        System.out.print("Enter time for ride: ");
        int time = scanner.nextInt();

        Ride ride = new Ride(distance,time);

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double fare = invoiceGenerator.calculateFare(ride);

        System.out.println("Fare for ride = " + fare);
    }
}