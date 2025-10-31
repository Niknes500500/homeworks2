package com.nikita.homework2;

public class Main {
    public static void main(String[] args) {
        Card card007 = new Card("Egor", 100);
        card007.addTo(100);
        card007.withdrawal(250);
        System.out.println(card007.getBalance());
        card007.balanceInAnotherCurrency(3);
    }
}
