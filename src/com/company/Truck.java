package com.company;

public class Truck {
    private String truckID;
    private double odometer;
    private double mpg;
    private double fuel;

    private static final double CAPACITY = 20.0;

    private static double totalFuel;

    public Truck(String id){
        truckID = id;
    }

    public Truck (double odo, double m, double fu){
        odometer = odo;
        mpg = m;
        fuel = fu;
    }





}
