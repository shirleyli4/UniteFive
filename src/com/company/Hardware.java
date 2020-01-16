package com.company;

public class Hardware {
    public static void main (String[] args){
        Item p1 = new Item (122.5,"4343","Circular Saw");
        Item p2 = new Item (19.75,"9876","Hammer");
        Item p3 = new Item (12.99,"1239","Level");
        double cir = p1.getTotalPrice(2);
        double ham = p2.getTotalPrice(5);
        double lev = p3.getTotalPrice(12);
        System.out.println("Total of circular saw: "+cir);
        System.out.println("Total of hammers: "+ham);
        System.out.println("Total of levels: "+lev);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
