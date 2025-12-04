package com.nikita.homework2;

public abstract class AbstractCard {

    protected String ownerName;
    protected double balance;

    public AbstractCard(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public AbstractCard(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void increaseBalance(double replenishmentAmount) {
        balance += replenishmentAmount;
    }

    public double balanceInAnotherCurrency(Currency currency) {
        return balance / currency.currency;
    }

    public abstract double withdrawBalance(double withdrawalAmount);
}

