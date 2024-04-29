package org.example.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Average {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,33,53,87,98,5);

        double average = list.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Average is: "+average);
    }
}
