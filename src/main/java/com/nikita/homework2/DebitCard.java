package com.nikita.homework2;

public class DebitCard extends AbstractCard {

    public DebitCard(String ownerName, double balance) {
        super(ownerName, balance);
    }

    public DebitCard(String ownerName) {
        super(ownerName);
    }

    @Override
    public double withdrawBalance(double withdrawalAmount) {
        System.out.println("with DEBIT");

        if (withdrawalAmount > getBalance()) {
            return 0;
        }
        balance -= withdrawalAmount;
        return withdrawalAmount;
    }
}
