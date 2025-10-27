package com.nikita.homeworks.homework1;

import java.util.Arrays;

public final class Median {

    private Median() {
    }

    public static double median(int[] array1) {

        int[] clone = array1.clone();
        Arrays.sort(clone);
        double median;
        median = (clone.length % 2 != 0)
                ? clone[(clone.length - 1) / 2]
                : (double) (clone[clone.length / 2 - 1] + clone[clone.length / 2]) / 2;

        return median;
    }

    public static double median(double[] array2) {

        double[] copy = array2.clone();
        Arrays.sort(copy);
        double median;
        median = (copy.length % 2 != 0)
                ? copy[(copy.length - 1) / 2]
                : (copy[copy.length / 2 - 1] + copy[copy.length / 2]) / 2;

        return median;
    }
}
