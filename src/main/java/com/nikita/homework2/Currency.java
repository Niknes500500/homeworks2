package com.nikita.homework2;

public enum Currency {
    USD(2.9),
    EUR(3.5),
    CNY(100);

    double currency;

    Currency(double currency) {
        this.currency = currency;
    }
}
