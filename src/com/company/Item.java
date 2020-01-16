package com.company;

public class Item {
    private String number = "";
    private String des = "";
    private double price;
    Item (double p, String n, String d) {
        price = p;
        des = d;
        number = n;
        if(price<0){
            price=0;
        }
    }

    public double getTotalPrice(int quantity){
        if(quantity<=0){
            quantity=0;
        }
        return price;
    }

    public String toString(){
        return "Item: "+number+"\nPrice: "+price+"\nDescription: "+des;
    }
}
