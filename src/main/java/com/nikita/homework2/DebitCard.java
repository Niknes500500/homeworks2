package com.nikita.homework2;

public class DebitCard extends Card {

    public DebitCard(String ownerName, double balance) {
        super(ownerName, balance);
    }

    public DebitCard(String ownerName) {
        super(ownerName);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public String getOwnerName() {
        return super.getOwnerName();
    }


    @Override
    public void increaseBalance(double replenishmentAmount) {
        super.increaseBalance(replenishmentAmount);
    }

    @Override
    public double withdrawBalance(double withdrawalAmount) {
        return super.withdrawBalance(withdrawalAmount);
    }

    @Override
    public double[] balanceInAnotherCurrency(double exchangeRateDollar, double exchangeRateEuro, double exchangeRateCNY) {
        return super.balanceInAnotherCurrency(exchangeRateDollar, exchangeRateEuro, exchangeRateCNY);
    }
}
