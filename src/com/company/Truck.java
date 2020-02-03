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

    public Truck (String id,double odo, double m, double fu){
        truckID=id;
        odometer = odo;
        mpg = m;
        fuel = fu;
    }

    public String getTruckID() {
        return truckID;
    }

    public double getOdometer() {
        return odometer;
    }

    public double getMpg() {
        return mpg;
    }

    public double getFuel() {
        return fuel;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    private boolean enoughFuel(double mile){
        double need = mile/mpg;
        if(fuel<need){
            return false;
        }else{
            return true;
        }

    }

    private String drive(double runMile){
        odometer+=runMile;
        fuel-=runMile/mpg;
        if(fuel+runMile/mpg<runMile/mpg){
            return "Truck "+ truckID+" does not have enough fuel to drive 500.0 miles";
        }else{
            return "success";
        }
    }

    private static void fill(){
        totalFuel=20;
    }

    private static String fill(double fi){
        totalFuel+=fi;
        if(totalFuel<=20){
            return "success";
        }else{
            totalFuel-=fi;
            return "fail";
        }
    }

    public static double getTotalFuel() {
        return totalFuel;
    }

    public String toString() {
        return "Truck: "+truckID+"/nOdometer: "+ odometer+"/nMiles Per Gallon: "+mpg+"/nFuel: "+fuel;
    }
}
