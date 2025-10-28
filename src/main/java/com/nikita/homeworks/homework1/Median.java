package com.nikita.homeworks.homework1;

import java.util.Arrays;

public final class Median {

    private Median() {
    }

    public static double median(int[] array) {

        int[] clonedArr = array.clone();
        Arrays.sort(clonedArr);
        double median;
        median = (clonedArr.length % 2 != 0)
                ? clonedArr[(clonedArr.length - 1) / 2]
                : (double) (clonedArr[clonedArr.length / 2 - 1] + clonedArr[clonedArr.length / 2]) / 2;

        return median;
    }

    public static double median(double[] input) {

        double[] inputCopy = input.clone();
        Arrays.sort(inputCopy);
        double median;
        median = (inputCopy.length % 2 != 0)
                ? inputCopy[(inputCopy.length - 1) / 2]
                : (inputCopy[inputCopy.length / 2 - 1] + inputCopy[inputCopy.length / 2]) / 2;

        return median;
    }
}
