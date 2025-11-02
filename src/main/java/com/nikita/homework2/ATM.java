package com.nikita.homework2;

public class ATM {

    private final Card card;

    public ATM(Card card) {
        this.card = card;
    }

    public void topUpTheCard(Card card, double replenishmentAmount) {
        card.balance += replenishmentAmount;
    }

    public void withdrawFromCard(Card card, double withdrawalAmount) {
        card.balance -= withdrawalAmount;
    }
}
