package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] atms;


    public Bank() {
        atms = new CashMachine[3];
        atms[0] = new CashMachine();
        atms[1] = new CashMachine();
        atms[2] = new CashMachine();

    }

    public void addAtm1Transaction(int transaction) {
//        this.atm1.add(transaction);
    }

    public void addAtm2Transaction(int transaction) {
//        this.atm2.add(transaction);
    }

    public void addAtm3Transaction(int transaction) {
//        this.atm3.add(transaction);
    }

    public int getCashIn() {
        int cashInCount = 0;
        for (int i = 0; i < atms.length; i++){
            cashInCount = atms[i].getCashIn() + cashInCount;
        }
        return cashInCount;
    }
    public int getCashOut() {
        int cashOutCount = 0;
        for (int i = 0; i < atms.length; i++){
            cashOutCount = atms[i].getCashOut() + cashOutCount;
        }
        return cashOutCount;
    }
    public int getBalance() {
        int totalBalance = 0;
        for (int i = 0; i < atms.length; i++){
            totalBalance = totalBalance + atms[i].getBalance();
        }
        return totalBalance;
    }

    public CashMachine[] getAtms() {
        return atms;
    }
    public double getAverage() {
        double totalTransactions = 0;
        for (int i = 0; i < atms.length; i++){
            totalTransactions = getCashIn() + getCashOut()/totalTransactions;
        }
        return totalTransactions;
    }


}




