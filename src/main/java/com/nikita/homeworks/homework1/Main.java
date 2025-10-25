package com.nikita.homeworks.homework1;

import static com.nikita.homeworks.homework1.Median.median;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 4, 5, 2};
        double[] arr2 = {1.2, 0, 6.6, 3.4, 7.7,};
        int result1 = median(arr1);
        double result2 = median(arr2);
        System.out.println(result1);
        System.out.println(result2);
    }
}
