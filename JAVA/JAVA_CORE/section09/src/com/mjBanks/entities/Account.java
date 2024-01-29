package com.mjBanks.entities;

public class Account {
    private int accountNumber;
    private String holder;
    private double balance;

    public Account(){}

    public Account(int accountNumber, String holder, double initialDeposit){
        this.accountNumber = accountNumber;
        setHolder(holder);
        isDeposit(initialDeposit);
    }

    //Overload to storage just the number and holder,
    // if the customer doesn't want makes an initial deposit on the opening Account process
    public Account(int accountNumber, String holder){
        this.accountNumber = accountNumber;
        this.holder = holder;
    }

    //Enter the Getters and Setters
    //No Setter was created for the accountNumber attribute;
    //According to the project's business rules, it is not allowed to change the account number

    public int getAccountNumber(){
        return this.accountNumber;
    }


    public String getHolder(){
        return this.holder;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }


    public double getBalance(){
        return balance;
    }

    public void isDeposit(double amount){
        balance += amount;
    }

    //There is a tax of $5.00 over each withdraw(Business Rules)
    public void isWithdraw(double amount){
         this.balance -= (amount + 5.00);
    }

    public String toString(){
        return "Account: "
                + getAccountNumber()
                + ", Holder: "
                + getHolder()
                + ", Balance: $ "
                + String.format("%.2f", getBalance());
    }

}
