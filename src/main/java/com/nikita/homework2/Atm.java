package com.nikita.homework2;

public class Atm {

    public void replenishMoney(AbstractCard card, double replenishmentAmount) {
        double balance = card.getBalance();
        balance += replenishmentAmount;
        card.setBalance(balance);
    }

    public double withdrawMoney(AbstractCard card, double withdrawalAmount) {
        double balance = card.getBalance();
        balance -= withdrawalAmount;
        card.setBalance(balance);
        return withdrawalAmount;
    }

    public double displayBalance(AbstractCard card) {
        return card.getBalance();
    }

    public double balanceInAnotherCurrency(AbstractCard card, Currency currency) {
        if (card.getBalance() <= 0) {
            return 0;
        }
        return card.balanceInAnotherCurrency(currency);
    }

}
