package com.nikita.homework2;

public class CreditCard extends AbstractCard {

    public CreditCard(String ownerName, double balance) {
        super(ownerName, balance);
    }

    public CreditCard(String ownerName) {
        super(ownerName);
    }

    @Override
    public double withdrawBalance(double withdrawalAmount) {
        System.out.println("with CREDIT");
        balance -= withdrawalAmount;
        return withdrawalAmount;
    }
}
