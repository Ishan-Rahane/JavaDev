package org.example.Arrays;

import java.util.Arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int[] num = {23, 55, 68, 12, 2, 4, 7, 2, 23, 55};

        int min = Arrays.stream(num).min().orElseThrow();
        System.out.println("Smallest element is "+ min);
    }
}
