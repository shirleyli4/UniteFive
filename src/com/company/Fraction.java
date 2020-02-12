package com.company;
/**
 *This program can do calculations between two Fractions, such as addition, subtraction, multiplication, and division
 * @author Shirley Shuzhou Li
 * @since February 10,2020
 *
 */
public class Fraction {
    private int numerator;
    private int denominator;
    /**
     *constructor
     * @param nu
     * @param de
     */
    public Fraction(int nu,int de){
        numerator=nu;
        denominator=de;
        negaandreduce(nu,de);
    }

    /**
     *reduce the fraction and make the negative sign to numerator
     * @param nu
     * @param de
     */
    public void negaandreduce(int nu,int de){
        int m=de;
        int n=nu;
        while (m % n != 0) {
            int oldm = m;
            int oldn = n;

            m = oldn;
            n = oldm % oldn;
        }
        nu/=n;
        de/=n;
        if(de<0){
            de*=-1;
            nu*=-1;
        }
        numerator=nu;
        denominator=de;
    }

    /**
     *greatest common factor
     * @param m
     * @param n
     * @return
     */
    private int gcd(int m, int n) {
        while (m % n != 0) {
            int oldm = m;
            int oldn = n;

            m = oldn;
            n = oldm % oldn;
        }
        return n;
    }

    /**
     *Constructor
     */
    public Fraction(){
        this(1,1);
    }

    /**
     *addition between two fraction
     * @param f1
     * @param f2
     * @return
     */
    public static Fraction add(Fraction f1, Fraction f2){
        if(f1.denominator==f2.denominator){
            int newnum=f1.numerator+f2.numerator;
            Fraction ret = new Fraction(newnum,f1.denominator);
            return ret;
        }else{
            int newnum=f1.numerator*f2.denominator+f2.numerator*f1.denominator;
            int newde=f1.denominator*f2.denominator;
            Fraction ret = new Fraction(newnum,newde);
            return ret;
        }
    }

    /**
     *subtraction between two fraction
     * @param f1
     * @param f2
     * @return
     */
    public static Fraction subtract(Fraction f1,Fraction f2){
        if(f1.denominator==f2.denominator){
            int newnum=f1.numerator-f2.numerator;
            Fraction ret = new Fraction(newnum,f1.denominator);
            return ret;
        }else{
            int newnum=f1.numerator*f2.denominator-f2.numerator*f1.denominator;
            int newde=f1.denominator*f2.denominator;
            Fraction ret = new Fraction(newnum,newde);
            return ret;
        }
    }

    /**
     *multiply two fractions
     * @param f1
     * @param f2
     * @return
     */
    public static Fraction multiply(Fraction f1, Fraction f2){
        int newnu=f1.numerator*f2.numerator;
        int newde=f1.denominator*f2.denominator;
        Fraction ret= new Fraction(newnu,newde);
        return ret;
    }

    /**
     *divide two fractions
     * @param f1
     * @param f2
     * @return
     */
    public static Fraction divide(Fraction f1, Fraction f2){
        int newnu=f1.numerator*f2.denominator;
        int newde=f1.denominator*f2.numerator;
        Fraction ret= new Fraction(newnu,newde);
        return ret;
    }

    /**
     *toString printing method
     * @return
     */
    @Override
    public String toString() {
        return numerator+"/"+denominator;
    }
}
