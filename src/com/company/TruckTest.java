package com.company;

public class TruckTest {
    public static void main (String[] args){
        Truck t1 = new Truck("123ABC");
        Truck t2 = new Truck("456DEF",45500,18,10);
        t1.setMpg(15);
        t1.fill();
        t1.drive(150);
        t1.toString();
        t1.drive(60);
        t1.toString();
        t2.drive(500);
        t2.fill(30);
        t2.fill();
        t2.drive(300);
        t2.toString();
        System.out.println(t1.getTotalFuel()+t2.getTotalFuel());
    }
}
