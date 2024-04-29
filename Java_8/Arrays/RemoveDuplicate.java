package org.example.Arrays;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] num = {23, 55, 68, 12, 2, 4, 7, 2, 23, 55};

        int[] array = Arrays.stream(num)
                .distinct()
                .toArray();

        System.out.println("Original array is :- "+Arrays.toString(num));
        System.out.println("After removing duplicates, the new array is :- "+Arrays.toString(array));
    }
}
