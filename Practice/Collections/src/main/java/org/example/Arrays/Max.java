package org.example.Arrays;

import java.util.List;
import java.util.OptionalInt;

public class Max {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);

        int max = list.stream()
                        .max(Integer::compareTo)
                                .orElse(null);
        System.out.println(max);

        int min = list.stream()
                .min(Integer::compareTo)
                .orElse(null);
        System.out.println(min);
    }
}
