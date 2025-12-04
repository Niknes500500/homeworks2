/*
package com.nikita.homework2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void addTo() {
        Card card = new Card("Alice", 200.0);
        card.increaseBalance(300.0); // 200 + 300 = 500
        assertEquals(500.0, card.getBalance(), 0);
    }

    @Test
    public void addToExactlyAllowed() {
        Card card = new Card("Alice", 900.0);
        card.increaseBalance(100.0); // 900 + 100 = 1000
        assertEquals(1000.0, card.getBalance(), 0);
    }

    @Test
    public void withdrawalWithinBalance() {
        Card card = new Card("Alice", 500.0);
        card.withdrawBalance(120.0); // 500 - 120 = 380
        assertEquals(380.0, card.getBalance(), 0);
    }

    @Test
    public void withdrawalAllBalanceAllowed() {
        Card card = new Card("Alice", 300.0);
        card.withdrawBalance(300.0); // 300 - 300 = 0
        assertEquals(0.0, card.getBalance(), 0);
    }

    @Test
    public void withdrawalAboveBalanceIgnored() {
        Card card = new Card("Alice", 250.0);
        card.withdrawBalance(300.0); // 250 < 300 > -> ignore
        assertEquals(250.0, card.getBalance(), 0);
    }

    @Test
    public void balanceInAnotherCurrency() {
        Card card = new Card("Alice", 300.0);
        card.balanceInAnotherCurrency(3.0); // 300 / 3 = 100
        assertEquals(100.0, card.getBalance(), 0);
    }

    @Test
    public void balanceInAnotherCurrencyNonIntegerRate() {
        Card card = new Card("Alice", 1000.0);
        card.balanceInAnotherCurrency(2.5); // 1000 / 2.5 = 400
        assertEquals(400.0, card.getBalance(), 0);
    }

}*/
