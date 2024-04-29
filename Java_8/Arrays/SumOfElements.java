package org.example.Arrays;

import java.util.Arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int[] num = {23, 55, 68, 12, 2, 4, 7, 2, 23, 55};

        int sum = Arrays.stream(num).sum();
        System.out.println("The sum of array elements is: "+sum);
    }
}
