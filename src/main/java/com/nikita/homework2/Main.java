package com.nikita.homework2;

public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm();

        AbstractCard creditCard = new CreditCard("Egor",200);
        atm.replenishMoney(creditCard,200);
        System.out.println(atm.displayBalance(creditCard));
        atm.withdrawMoney(creditCard,200);
        System.out.println(atm.displayBalance(creditCard));
        System.out.println(atm.balanceInAnotherCurrency(creditCard,Currency.USD));
        System.out.println(atm.balanceInAnotherCurrency(creditCard,Currency.EUR));
        System.out.println(atm.balanceInAnotherCurrency(creditCard,Currency.CNY));

        AbstractCard debitCard = new DebitCard("Egor",200);
        atm.replenishMoney(debitCard,200);
        System.out.println(atm.displayBalance(debitCard));
        atm.withdrawMoney(debitCard,555);
        System.out.println(atm.displayBalance(debitCard));
        System.out.println(atm.balanceInAnotherCurrency(debitCard,Currency.USD));
        System.out.println(atm.balanceInAnotherCurrency(debitCard,Currency.EUR));
        System.out.println(atm.balanceInAnotherCurrency(debitCard,Currency.CNY));
    }
}
