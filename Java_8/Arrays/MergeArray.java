package org.example.Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 3};

        int[] num = {23, 55, 68, 12, 2, 4, 7, 2, 23, 55};

        int[] merge = IntStream.concat(Arrays.stream(array), Arrays.stream(num)).toArray();
        System.out.println("The merged array is :- "+Arrays.toString(merge));
    }
}
