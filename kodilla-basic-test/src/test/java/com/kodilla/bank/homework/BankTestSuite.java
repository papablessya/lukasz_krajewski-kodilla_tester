package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void bankTest(){
        Bank bank = new Bank();
        assertEquals(0,bank.getBalance());
    }
    @Test
    public void testOnePositiveTransaction() {
        Bank bank = new Bank();
        CashMachine[] atms = bank.getAtms();
        atms[0].add(10);
        assertEquals(10, bank.getCashIn());
        assertEquals(10, bank.getBalance());
        assertEquals(0,bank.getCashOut());
    }
    @Test
    public void testOneNegativeTransaction() {
        Bank bank = new Bank();
        CashMachine[] atms = bank.getAtms();
        atms[1].add(-2);
        assertEquals(-2,bank.getCashOut());
        assertEquals(0,bank.getCashIn());
        assertEquals(-2,bank.getBalance());
    }
    @Test
    public void testDifferentTransactions() {
        Bank bank = new Bank();
        CashMachine[] atms = bank.getAtms();
        atms[0].add(1);
        atms[1].add(-2);
        atms[2].add(3);
        atms[2].add(-1);
        assertEquals(1,bank.getBalance());
        assertEquals(4,bank.getCashIn());
        assertEquals(-3,bank.getCashOut());
    }
    @Test
    public void testAverageTransactions(){
        Bank bank = new Bank();
        CashMachine[] atms = bank.getAtms();
        atms[0].add(2);
        atms[1].add(1);
        assertEquals(1,bank.getAverageIn() + bank.getAverageOut());
    }
    @Test
    public void testOnlyNegativeAverageTransactions(){
        Bank bank = new Bank();
        CashMachine[] atms = bank.getAtms();
        atms[0].add(-2);
        atms[1].add(-1);
        atms[2].add(-5);
        assertEquals(2.6,bank.getAverageIn() + bank.getAverageOut());
    }
    @Test
    public void testOnlyPositiveAverageTransactions(){
        Bank bank = new Bank();
        CashMachine[] atms = bank.getAtms();
        atms[0].add(2);
        atms[1].add(4);
        atms[2].add(3);
        assertEquals(3,bank.getAverageIn() + bank.getAverageOut());
    }
    @Test
    public void testMixedAverageTransactions(){
        Bank bank = new Bank();
        CashMachine[] atms = bank.getAtms();
        atms[0].add(2);
        atms[0].add(-1);
        atms[1].add(20);
        atms[1].add(2);
        atms[2].add(-4);
        atms[2].add(-2);
        assertEquals(2.83,bank.getAverageIn() + bank.getAverageOut());
    }

}
