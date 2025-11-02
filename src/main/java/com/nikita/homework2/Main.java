package com.nikita.homework2;

public class Main {
    public static void main(String[] args) {
        Card card007 = new Card("Egor", 100);
        card007.increaseBalance(100);
        card007.withdrawBalance(250);
        System.out.println(card007.getBalance());
        card007.balanceInAnotherCurrency(3,3.5,2.39);
        ATM atm = new ATM(card007);
        atm.topUpTheCard(card007,100);
        atm.withdrawFromCard(card007,50);
    }
}
