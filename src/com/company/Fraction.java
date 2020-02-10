package com.company;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int nu,int de){
        nega(nu,de);
        reduce(nu,de);
        numerator=nu;
        denominator=de;
    }
    public static void nega(int nu,int de){
        if(de<0){
            de*=-1;
            nu+=-1;
        }
    }
    public static void reduce(int nu, int de){
        if(de%nu==0){
            int mul=de/nu;
            nu/=mul;
            de/=mul;
        }
    }
    public Fraction(){
        this(1,1);
    }
    public static Fraction add(Fraction f1, Fraction f2){
        if(f1.denominator==f2.denominator){
            int newnum=f1.numerator+f2.numerator;
            reduce(newnum,f1.denominator);
            Fraction ret = new Fraction(newnum,f1.denominator);
            return ret;
        }else if(f1.denominator%f2.denominator==0){
           int mul=f1.denominator/f2.denominator;
           f1.denominator*=mul;
           f1.numerator*=mul;
           int newnum=f1.numerator+f2.numerator;
           reduce(newnum,f1.denominator);
           Fraction ret = new Fraction(newnum,f1.denominator);
           return ret;
        }else{
            f1.numerator*=f2.denominator;
            f2.numerator*=f1.denominator;
            int newnum=f1.numerator+f2.numerator;
            f1.denominator*=f2.denominator;
            reduce(newnum,f1.denominator);
            Fraction ret = new Fraction(newnum,f1.denominator);
            return ret;
        }
    }
    public static Fraction subtract(Fraction f1,Fraction f2){
        int f1num=f1.numerator;
        int f2num=f2.numerator;
        f1num*=f2.denominator;
        f2num*=f1.denominator;
        if(f1num<f2num){
            if(f1.denominator==f2.denominator){
                int newnum=f2.numerator+-f1.numerator;
                reduce(newnum,f1.denominator);
                Fraction ret = new Fraction(newnum,f1.denominator);
                return ret;
            }else if(f1.denominator%f2.denominator==0){
                int mul=f1.denominator/f2.denominator;
                f1.denominator*=mul;
                f1.numerator*=mul;
                int newnum=f2.numerator-f1.numerator;
                reduce(newnum,f1.denominator);
                Fraction ret = new Fraction(newnum,f1.denominator);
                return ret;
            }else{
                f1.numerator*=f2.denominator;
                f2.numerator*=f1.denominator;
                int newnum=f2.numerator-f1.numerator;
                f1.denominator*=f2.denominator;
                reduce(newnum,f1.denominator);
                Fraction ret = new Fraction(newnum,f1.denominator);
                return ret;
            }
        }else if(f2num<f1num){
            if(f1.denominator==f2.denominator){
                int newnum=f1.numerator-f2.numerator;
                reduce(newnum,f1.denominator);
                Fraction ret = new Fraction(newnum,f1.denominator);
                return ret;
            }else if(f1.denominator%f2.denominator==0){
                int mul=f1.denominator/f2.denominator;
                f1.denominator*=mul;
                f1.numerator*=mul;
                int newnum=f1.numerator-f2.numerator;
                reduce(newnum,f1.denominator);
                Fraction ret = new Fraction(newnum,f1.denominator);
                return ret;
            }else{
                f1.numerator*=f2.denominator;
                f2.numerator*=f1.denominator;
                int newnum=f1.numerator-f2.numerator;
                f1.denominator*=f2.denominator;
                reduce(newnum,f1.denominator);
                Fraction ret = new Fraction(newnum,f1.denominator);
                return ret;
            }
        }else{
            Fraction ret = new Fraction(0,1);
            return ret;
        }
    }
    public static Fraction multiply(Fraction f1, Fraction f2){
    return f1;
    }
    public static Fraction divide(Fraction f1, Fraction f2){
        return f1;
    }

    @Override
    public String toString() {
        return numerator+"/"+denominator;
    }
}
