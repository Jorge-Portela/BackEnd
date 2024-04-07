package bankAccount.model.entities;

import bankAccount.model.exception.AccountException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(){}


    public Account(Integer number, String holder, Double balance, Double withdraw) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdraw;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }


    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }

    public void withdraw(Double amount) throws AccountException {
        if(amount > this.balance){
            throw new AccountException("Not enough balance");
        }
        if(amount > this.withdrawLimit){
            throw new AccountException("The amount exceeds withdraw limit");
        }
        this.balance -= amount;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("New balance: $ %.2f",this.getBalance()));

        return sb.toString();
    }

}
