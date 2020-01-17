package com.company;

public class CarTrip {
    private double myStartOdometer;
    private double myEndOdometer;
    private double myTime;
    private double myGallonsUsed;

    public CarTrip(double sta, double end, double time, double gal){
        myStartOdometer=sta;
        myEndOdometer=end;
        myTime=time;
        myGallonsUsed=gal;
    }

    public CarTrip(){
        myStartOdometer=0;
        myEndOdometer=0;
        myTime=0;
        myGallonsUsed=0;
    }

    public double getMyStartOdometer() {
        return myStartOdometer;
    }

    public double getMyEndOdometer() {
        return myEndOdometer;
    }

    public double getMyGallonsUsed() {
        return myGallonsUsed;
    }

    public double getMyTime() {
        return myTime;
    }

    public void setMyStartOdometer(double myStartOdometer) {
        this.myStartOdometer = myStartOdometer;
    }

    public void setMyEndOdometer(double myEndOdometer) {
        this.myEndOdometer = myEndOdometer;
    }

    public void setMyGallonsUsed(double myGallonsUsed) {
        this.myGallonsUsed = myGallonsUsed;
    }

    public void setMyTime(double myTime) {
        this.myTime = myTime;
    }

    double getTripDistance(){
        return myEndOdometer-myStartOdometer;
    }

    double getAverageSpeed(){
        if (myTime == 0) {
            double ave=(myEndOdometer-myStartOdometer)/(1+myTime);
            return ave;
        }else{
            double ave=(myEndOdometer-myStartOdometer)/myTime;
            return ave;
        }
    }

    double getGasMileage(){
        if(myGallonsUsed==0){
            double gm = (myEndOdometer - myStartOdometer) / (1+myGallonsUsed);
            return gm;
        }else {
            double gm = (myEndOdometer - myStartOdometer) / myGallonsUsed;
            return gm;
        }
    }

    double getTotalGasPrice(double pricePerGallon){
        return pricePerGallon*myGallonsUsed;
    }

    public String toString(){
        double dis = myEndOdometer-myStartOdometer;
        return "Distance traveled: "+dis +" miles";
    }
    public static void main(String[] args){

    }
}
