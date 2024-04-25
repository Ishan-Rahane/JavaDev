package org.example.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintDuplicate {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 3};

        List<Integer> list = Arrays.asList(array);

        // Using Java 8 features to find and print duplicate elements
        List<Integer> duplicates = list.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .toList();

        System.out.println("Duplicate elements: " + duplicates);

    }
}
