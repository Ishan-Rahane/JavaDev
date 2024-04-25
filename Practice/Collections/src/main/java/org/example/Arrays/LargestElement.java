package org.example.Arrays;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class LargestElement {
    public static void main(String[] args) {
        int[] num = {23, 55, 68, 12, 2, 4, 7, 2, 23, 55};

        int max = Arrays.stream(num).max().orElseThrow();
        System.out.println("Largest element is "+ max);
    }
}
