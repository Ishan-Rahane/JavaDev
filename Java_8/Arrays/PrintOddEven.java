package org.example.Arrays;

import java.util.Arrays;

public class PrintOddEven {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 3};

        System.out.println("Odd Elements:");
        Arrays.stream(array)
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);

        System.out.println("Even Elements:");
        Arrays.stream(array)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
