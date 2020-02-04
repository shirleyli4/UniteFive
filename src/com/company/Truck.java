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

    public String drive(double runMile){
        odometer+=runMile;
        fuel-=runMile/mpg;
        if(fuel+runMile/mpg<runMile/mpg){
            return "Truck "+ truckID+" does not have enough fuel to drive 500.0 miles.";
        }else{
            return "success";
        }
    }

    public void fill(){
        fuel=CAPACITY;
    }

    public String fill(double fi){
        totalFuel+=fi;
        if(totalFuel<=CAPACITY){
            return "success";
        }else{
            totalFuel-=fi;
            return "Truck "+truckID+": Gallons exceeds tank capacity";
        }
    }

    public static double getTotalFuel() {
        return totalFuel;
    }

    public String toString() {
        return "Truck: "+truckID+"\n"+"Odometer: "+ odometer+"\n"+"Miles Per Gallon: "+mpg+"\n"+"Fuel: "+fuel;
    }
}
