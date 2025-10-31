package com.nikita.homework2;

public class Card {

    private String ownerName;
    double balance;

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

    public void addTo(double replenishmentAmount) {
        if (balance + replenishmentAmount > 1000) {
            return;
        }
        balance = balance + replenishmentAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        if (withdrawalAmount > balance) {
            return;
        }
        balance = balance - withdrawalAmount;
    }

    public void balanceInAnotherCurrency(double exchangeRate) {
        balance = balance / exchangeRate;
    }
}
