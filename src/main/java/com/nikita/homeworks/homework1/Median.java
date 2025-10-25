package com.nikita.homeworks.homework1;

import java.util.Arrays;

public class Median {

    public static int median(int[] arr1) {
        Arrays.sort(arr1);
        int lengthArr = arr1.length;
        int medianIndex;
        int halfSum1 = lengthArr / 2 - 1;
        int halfSum2 = lengthArr / 2;

        if (lengthArr % 2 != 0) {
            medianIndex = (lengthArr - 1) / 2;
        } else {
            medianIndex = (halfSum1 + halfSum2) / 2;
        }

        return arr1[medianIndex];
    }

    public static double median(double[] arr2) {
        Arrays.sort(arr2);
        int lengthArr = arr2.length;
        int medianIndex;
        int halfSum1 = lengthArr / 2 - 1;
        int halfSum2 = lengthArr / 2;

        if (lengthArr % 2 != 0) {
            medianIndex = (lengthArr - 1) / 2;
        } else {
            medianIndex = (halfSum1 + halfSum2) / 2;
        }

        return arr2[medianIndex];
    }
}
