package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZero() {
        CashMachine cashMachine = new CashMachine();
        int [] transactions = cashMachine.getTransactions ();
        assertEquals (0, transactions.length);
    }

    @Test
    public void shouldAddTwoTransactions() {

        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-30);
        cashMachine.add(100);

        int [] transactions = cashMachine.getTransactions();
        assertEquals (2, transactions.length);
        assertEquals(-30, transactions[0]);
        assertEquals(100, transactions[1]);
    }
    @Test
    public void shouldCountBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-30);
        cashMachine.add(100);
        cashMachine.add(250);

        assertEquals(320, cashMachine.getBalance());
    }
    @Test
    public void countInAverageNoTransactions(){
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getAverageIn());
    }
    @Test
    public void countInAverageMixTransactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(1);
        cashMachine.add(-1);
        assertEquals(1, cashMachine.getAverageIn());
    }
    @Test
    public void countInAverageManyTransactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(1);
        cashMachine.add(3);
        cashMachine.add(4);
        cashMachine.add(5);
        double expectedAverage = 3.25;
        assertEquals(expectedAverage, cashMachine.getAverageIn());
    }
    @Test
    public void countInAverageOnlyWithdraw(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-1);
        assertEquals(0,cashMachine.getAverageIn());
    }
    @Test
    public void countOutAverageNoTransactions(){
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getAverageOut());
    }
    @Test
    public void countOutAverageMixTransactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(1);
        cashMachine.add(-1);
        assertEquals(-1, cashMachine.getAverageOut());
    }
    @Test
    public void countOutAverageManyTransactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-1);
        cashMachine.add(-3);
        cashMachine.add(-4);
        cashMachine.add(-5);
        double expectedAverage = -3.25;
        assertEquals(expectedAverage, cashMachine.getAverageOut());
    }
    @Test
    public void countOutAverageOnlyPayment(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(1);
        assertEquals(0,cashMachine.getAverageOut());
    }

}





