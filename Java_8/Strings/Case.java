package org.example.Strings;

import java.util.List;

public class Case {

    public static void main(String[] args) {

        List<String> list = List.of("india","England","Australia","New Zealand");

        List<String> upper = list.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(upper);


        List<String> lower = upper.stream()
                .map(String::toLowerCase)
                .toList();

        System.out.println(lower);
    }
}
