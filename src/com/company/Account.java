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
        acctNum=(int)(Math.random()*999)+1;
        this.first="";
        this.last="";
        this.balance=0;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double money){
        balance+=money;
    }

    public boolean withdrawal(double sub){

    }
}
