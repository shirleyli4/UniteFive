package  com.company;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TruckTestTest {

    static Truck t1;
    static Truck t2;



    @BeforeClass
    public static void setUp() {
        t1 = new Truck("123ABC");
        t2 = new Truck("456DEF", 45500, 18, 10);
    }


    @Test
    public void at1StartingToString() {
        assertEquals("Truck: 123ABC\nOdometer: 0.0\nMiles Per Gallon: 0.0\nFuel: 0.0",
                t1.toString());
    }

    @Test
    public void bt2StartingToString() {
        assertEquals("Truck: 456DEF\nOdometer: 45500.0\nMiles Per Gallon: 18.0\nFuel: 10.0",
                t2.toString());
    }

    @Test
    public void ct3SetFuel() {
        t1.setMpg(15);
        assertEquals(15.0, t1.getMpg(), 0.0);
    }

    @Test
    public void dt1FillTank() {
        t1.fill();
        assertEquals(20.0, t1.getFuel(), 0.0);
    }

    @Test
    public void et1Drive150() {
        t1.drive(150);
        assertEquals(150.0, t1.getOdometer(), 0.0);
    }

    @Test
    public void ft1Drive60() {
        t1.drive(60);
        assertEquals(210.0, t1.getOdometer(), 0.0);
    }

    @Test
    public void gPrintT1AfterDriving() {
        assertEquals("Truck: 123ABC\nOdometer: 210.0\nMiles Per Gallon: 15.0\nFuel: 6.0",
                t1.toString());
    }

    @Test
    public void hDriveT2500() {
        String message = t2.drive(500);
        assertEquals("Truck 456DEF does not have enough fuel to drive 500.0 miles.", message);
    }

    @Test
    public void iAdd30GallonsT2() {
        String message = t2.fill(30);
        assertEquals("Truck 456DEF: Gallons exceeds tank capacity", message);
    }

    @Test
    public void jFillT2Tank() {
        t2.fill();
        assertEquals(20.0, t2.getFuel(), 0.0);
    }

    @Test
    public void kDriveT2300Miles() {
        t2.drive(300);
        assertEquals(45800, t2.getOdometer(), 0.0);
    }

    @Test
    public void lTotalFuel() {
        assertEquals(30, Truck.getTotalFuel(), 0.0);
    }

}