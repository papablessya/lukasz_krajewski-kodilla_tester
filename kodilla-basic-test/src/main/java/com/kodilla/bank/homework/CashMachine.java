package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;
    private int balance = 0;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = value;
        this.transactions = newTab;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getBalance() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int balance = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            balance += this.transactions[i];
        }
        return balance;

    }

    public int getCashIn() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int cashIn = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] > 0) {
                cashIn += this.transactions[i];
            }
        }
        return cashIn;

    }

    public int getCashOut() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int cashOut = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] < 0) {
                cashOut += this.transactions[i];
            }
        }
        return cashOut;

    }
    public double getAverageIn(){
        if(this.transactions.length == 0) {
        return  0;
        }
        int cashInCount = 0;
        for (int i = 0; i < this.transactions.length; i++){
            if (this.transactions[i] > 0) {
                cashInCount ++;
            }
        }
        if (cashInCount == 0){
            return 0;}
        double cashInAverage = (double) getCashIn()/cashInCount;
        return cashInAverage;
    }
    public double getAverageOut(){
        if(this.transactions.length == 0) {
            return 0;
        }
        int cashOutCount = 0;
        for (int i = 0; i < this.transactions.length; i++){
            if (this.transactions[i] < 0) {
                cashOutCount ++;
            }
        }
        if (cashOutCount == 0){
            return 0;}
        double cashOutAverage = (double) getCashOut()/cashOutCount;
        return cashOutAverage;
        }
    }


