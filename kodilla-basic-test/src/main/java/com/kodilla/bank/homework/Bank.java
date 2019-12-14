package com.kodilla.bank.homework;

public class Bank {
    private String name;
    private CashMachine atm1;
    private CashMachine atm2;
    private CashMachine atm3;

    public Bank(String name) {
        this.name = name;
        this.atm1 = new CashMachine();
        this.atm2 = new CashMachine();
        this.atm3 = new CashMachine();
    }

    public void addAtm1Transaction(int transaction) {
        this.atm1.add(transaction);
    }

    public void addAtm2Transaction(int transaction) {
        this.atm2.add(transaction);
    }

    public void addAtm3Transaction(int transaction) {
        this.atm3.add(transaction);
    }

    public double getCashIn() {
        double sum = this.atm1.getCashIn() + this.atm2.getCashIn() + this.atm3.getCashIn();
        return sum;
    }
    public double getCashOut() {
        double sum = this.atm1.getCashOut() + this.atm2.getCashOut() + this.atm3.getCashOut();
        return sum;
    }
    public double getBalance() {
        double sum = this.atm1.getBalance() + this.atm2.getBalance() + this.atm3.getBalance();
        return sum;
    }



}




