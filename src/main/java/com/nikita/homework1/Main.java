package com.nikita.homework1;

import static com.nikita.homework1.Median.median;

public class Main {

    public static void main(String[] args) {
        double[] arr2 = {1, 6, 2, 8, 7, 2};
        int[] arr1 = {1, 2, 3, 4};
        double result1 = median(arr1);
        double result2 = median(arr2);
        System.out.println(result1);
        System.out.println(result2);
    }
}
