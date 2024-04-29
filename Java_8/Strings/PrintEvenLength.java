package org.example.Strings;

import java.util.Arrays;
import java.util.List;

public class PrintEvenLength {
    public static void main(String[] args) {
        String name = "My name is Ishan Rahane. I live in Pune";

        List<String> list = Arrays.stream(name.split("\\s+"))
                .filter(word -> word.length() % 2 == 0)
                .toList();

        System.out.println("the words with even length are :- "+list);
    }
}
