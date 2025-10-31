package com.nikita.homework1;

import java.util.Arrays;

public final class Median {

    private Median() {
    }

    public static double median(int[] array) {

        int[] arrayCopy = array.clone();
        Arrays.sort(arrayCopy);
        double median;
        median = (arrayCopy.length % 2 != 0)
                ? arrayCopy[(arrayCopy.length - 1) / 2]
                : (double) (arrayCopy[arrayCopy.length / 2 - 1] + arrayCopy[arrayCopy.length / 2]) / 2;

        return median;
    }

    public static double median(double[] array) {

        double[] arrayCopy = array.clone();
        Arrays.sort(arrayCopy);
        double median;
        median = (arrayCopy.length % 2 != 0)
                ? arrayCopy[(arrayCopy.length - 1) / 2]
                : (arrayCopy[arrayCopy.length / 2 - 1] + arrayCopy[arrayCopy.length / 2]) / 2;

        return median;
    }
}
