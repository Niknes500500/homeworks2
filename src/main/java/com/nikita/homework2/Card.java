package com.nikita.homework2;

public class Card {

    protected String ownerName;
    protected double balance;

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

    public double[] balanceInAnotherCurrency(double exchangeRateDollar, double exchangeRateEuro, double exchangeRateCNY) {
        return new double[]{getBalance() / exchangeRateDollar, getBalance() / exchangeRateEuro, getBalance() * exchangeRateCNY};
    }
}

