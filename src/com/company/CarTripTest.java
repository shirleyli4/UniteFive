package com.company;

import static org.junit.Assert.*;

public class CarTripTest {

    CarTrip t1 = new CarTrip();
    CarTrip t2 = new CarTrip(250, 1000, 36.5, 475);

    @org.junit.Test
    public void getMyEndOdometer() {
        assertEquals(0.0, t1.getMyEndOdometer(), 0.0);
        assertEquals(1000.0, t2.getMyEndOdometer(), 0.0);

    }

    @org.junit.Test
    public void getMyGallonsUsed() {
        assertEquals(0.0, t1.getMyGallonsUsed(), 0.0);
        assertEquals(475.0, t2.getMyGallonsUsed(), 0.0);
    }

    @org.junit.Test
    public void getMyStartOdometer() {
        assertEquals(0.0, t1.getMyStartOdometer(), 0.0);
        assertEquals(250.0, t2.getMyStartOdometer(), 0.0);
    }

    @org.junit.Test
    public void getMyTime() {
        assertEquals(0.0, t1.getMyTime(), 0.0);
        assertEquals(36.5, t2.getMyTime(), 0.0);
    }

    @org.junit.Test
    public void getTripDistance() {
        assertEquals(0.0, t1.getTripDistance(), 0.0);
        assertEquals(750.0, t2.getTripDistance(), 0.0);
    }

    @org.junit.Test
    public void getAverageSpeed() {
        assertEquals(0.0, t1.getAverageSpeed(), 0.0);
        assertEquals(20.54794520547945, t2.getAverageSpeed(), 0.001);

    }

    @org.junit.Test
    public void getGasMileage() {
        assertEquals(0.0, t1.getGasMileage(), 0.0);
        assertEquals(1.5789473684210527, t2.getGasMileage(), 0.001);
    }

    @org.junit.Test
    public void getTotalGasPrice() {
        assertEquals(0.0, t1.getTotalGasPrice(2.55), 0.0);
        assertEquals(1211.25, t2.getTotalGasPrice(2.55), 0.01);

    }

    @org.junit.Test
    public void toString1() {
        assertEquals("Distance traveled: 0.0 miles", t1.toString());
        assertEquals("Distance traveled: 750.0 miles", t2.toString());
    }
}