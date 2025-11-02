package com.nikita.homework2;

public class Card {

    private String ownerName;
    private double balance;

    public Card(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public Card(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void increaseBalance(double replenishmentAmount) {
        balance += replenishmentAmount;
    }

    public double withdrawBalance(double withdrawalAmount) {
        if (withdrawalAmount > balance) {
            return 0;
        }
        balance -= withdrawalAmount;
        return withdrawalAmount;
    }

    public double balanceInAnotherCurrency(double exchangeRate) {
        return getBalance() / exchangeRate;
    }
}

