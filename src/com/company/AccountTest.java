package com.company;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccountTest {

    static Account acct1;
    static Account acct2;
    static Account acct3;

    @BeforeClass
    public static void setUp() {
       acct1 = new Account();
       acct2 = new Account("George", "Fox", 60.00);
       acct3 = new Account(acct2);
       acct1.setFirst("Jennifer");
       acct1.setLast("Lopez");
       acct1.deposit(155.25);
       acct2.deposit(20);
       acct3.setLast("Wilson");
       acct3.deposit(15);
    }

    @Test
    public void aCheckAccountOneNumbers() {
        assertTrue(acct1.getAcctNum() >=1 && acct1.getAcctNum() <= 999);
    }

    @Test
    public void bCheckAccountTwoNumbers() {
        assertTrue(acct2.getAcctNum() >=1 && acct2.getAcctNum() <= 999);
    }

    @Test
    public void cCheckAccountThreeNumbers() {
        assertTrue(acct3.getAcctNum() >=1 && acct3.getAcctNum() <= 999);
    }

    @Test
    public void dOverdraftAcctOne() {
        assertFalse(acct2.withdrawal(90));
    }

    @Test
    public void eWithdrawFunds() {
        acct1.withdrawal(100.00);
        assertEquals(55.25, acct1.getBalance(), 0.0);
    }

    @Test
    public void fAccountThreeBalance() {
        assertEquals(75.0, acct3.getBalance(), 0.0);
    }

    @Test
    public void gPrintAccountThree() {
        assertEquals("Customer Name: George Wilson\nAccount #: " +
                acct3.getAcctNum() + "\nCurrent Balance: $75.0", acct3.toString());
    }

    @Test
    public void hPrintAccountOne() {
        assertEquals("Customer Name: Jennifer Lopez\nAccount #: " +
                acct1.getAcctNum() + "\nCurrent Balance: $55.25", acct1.toString());
    }




}