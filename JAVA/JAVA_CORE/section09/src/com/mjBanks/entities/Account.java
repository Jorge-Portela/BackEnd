package com.mjBanks.entities;

public class Account {
    private int accountNumber;
    private String holder;
    private  double initialDeposit;
    private double balance;

    public Account(){}

    public Account(int accountNumber, String holder, double initialDeposit){
        this.accountNumber = accountNumber;
        setHolder(holder);
        isDeposit(initialDeposit);
    }


    //Enter the Getters and Setters

    public int getAccountNumber(){
        return this.accountNumber;
    }

    //No Setter was created for the accountNumber attribute;
    //According to the project's business rules, it is not allowed to change the account number

    public String getHolder(){
        return this.holder;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }


    public double showBalance(){
        return balance;
    }

    public void isDeposit(double deposit){
        balance += deposit;
    }

    //There is a tax of $5.00 over each withdraw(Business Rules)
    public double isWithdraw(double withdraw){
        return this.balance -= (withdraw + 5.00);
    }

    public String toString(){
        return "Account: "
                + getAccountNumber()
                + ", Holder: "
                + getHolder()
                + ", Balance: $ "
                + String.format("%.2f", showBalance());
    }

}
