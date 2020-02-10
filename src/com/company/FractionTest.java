package com.company;
import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest {

    @Test
    public void testToString() {
        Fraction f1 = new Fraction(5, -6);
        assertEquals("-5/6", f1.toString());
    }

    @Test
    public void defaultConstructor() {
        Fraction f1 = new Fraction();
        assertEquals("1/1", f1.toString());
    }

    @Test
    public void addPositive() {
        Fraction f1 = new Fraction(5, 6);
        Fraction f2 = new Fraction(7, 8);
        Fraction result = Fraction.add(f1, f2);
        assertEquals("41/24", result.toString());
    }

    @Test
    public void addOneNegative() {
        Fraction f1 = new Fraction(5, 6);
        Fraction f2 = new Fraction(-7, 8);
        Fraction result = Fraction.add(f1, f2);
        assertEquals("-1/24", result.toString());
    }

    @Test
    public void addTwoNegatives() {
        Fraction f1 = new Fraction(4, -6);
        Fraction f2 = new Fraction(-7, 5);
        Fraction result = Fraction.add(f1, f2);
        assertEquals("-31/15", result.toString());
    }

    @Test
    public void subtractPositive() {
        Fraction f1 = new Fraction(1, 9);
        Fraction f2 = new Fraction(3, 5);
        Fraction result = Fraction.subtract(f1, f2);
        assertEquals("-22/45", result.toString());
    }

    @Test
    public void subtractNegative() {
        Fraction f1 = new Fraction(1, 9);
        Fraction f2 = new Fraction(-3, 5);
        Fraction result = Fraction.subtract(f1, f2);
        assertEquals("32/45", result.toString());
    }

    @Test
    public void subtractTwoNegatives() {
        Fraction f1 = new Fraction(5, -8);
        Fraction f2 = new Fraction(-3, 4);
        Fraction result = Fraction.subtract(f1, f2);
        assertEquals("1/8", result.toString());
    }

    @Test
    public void multiplyPositive() {
        Fraction f1 = new Fraction(5, 8);
        Fraction f2 = new Fraction(3, 4);
        Fraction result = Fraction.multiply(f1, f2);
        assertEquals("15/32", result.toString());
    }

    @Test
    public void multiplyNegative() {
        Fraction f1 = new Fraction(-5, 8);
        Fraction f2 = new Fraction(3, 4);
        Fraction result = Fraction.multiply(f1, f2);
        assertEquals("-15/32", result.toString());
    }

    @Test
    public void multiplyTwoNegatives() {
        Fraction f1 = new Fraction(-5, 8);
        Fraction f2 = new Fraction(3, -4);
        Fraction result = Fraction.multiply(f1, f2);
        assertEquals("15/32", result.toString());
    }


    @Test
    public void dividePositive() {
        Fraction f1 = new Fraction(5, 8);
        Fraction f2 = new Fraction(3, 4);
        Fraction result = Fraction.divide(f1, f2);
        assertEquals("5/6", result.toString());
    }

    @Test
    public void divideNegative() {
        Fraction f1 = new Fraction(-5, 8);
        Fraction f2 = new Fraction(3, 4);
        Fraction result = Fraction.divide(f1, f2);
        assertEquals("-5/6", result.toString());
    }

    @Test
    public void divideTwoNegatives() {
        Fraction f1 = new Fraction(-5, 8);
        Fraction f2 = new Fraction(3, -4);
        Fraction result = Fraction.divide(f1, f2);
        assertEquals("5/6", result.toString());
    }
}