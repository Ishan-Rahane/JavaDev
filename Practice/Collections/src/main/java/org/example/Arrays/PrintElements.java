package org.example.Arrays;

import java.util.Arrays;

public class PrintElements {
    public static void main(String[] args) {
        int [] num = new int[]{23,55,68,12,2,4,7,2,23,55};
        Arrays.stream(num).forEach(System.out::println);
    }
}
