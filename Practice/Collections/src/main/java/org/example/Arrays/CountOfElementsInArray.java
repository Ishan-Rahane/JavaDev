package org.example.Arrays;

import java.util.Arrays;
import java.util.List;

public class CountOfElementsInArray {
    public static void main(String[] args) {
        int[] num = {23, 55, 68, 12, 2, 4, 7, 2, 23, 55};

        long count = Arrays.stream(num).count();
        System.out.println("Count of elements in an array is "+ count);
    }
}
