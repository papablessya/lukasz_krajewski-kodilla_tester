package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void bankTest(){
        Bank bank = new Bank();
        assertEquals(0,bank.getBalance());
    }


}
