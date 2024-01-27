package com.mjBanks.entities;

public class Account {
    int accountNumber;
    String holder;
    double initialDeposit;

    Account(int accountNumber, String holder, double initialDeposit){
        this.accountNumber = accountNumber;
        this.holder = holder;

    }
}
