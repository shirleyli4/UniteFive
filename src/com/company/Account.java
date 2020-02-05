package com.company;

public class Account {
    private String first;
    private String last;
    private int acctNum;
    private double balance;
    public Account (String first, String last,double balance){
        acctNum=(int)(Math.random()*999)+1;
        this.first=first;
        this.last=last;
        this.balance=balance;
    }
    public Account(Account dup){
        dup = new Account (this.first,this.last,this.balance);
    }
    public Account(){
        this.first="";
        this.last="";
        this.balance=0;
    }

}
