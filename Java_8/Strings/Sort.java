package org.example.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args) {
        String input = "ishanrahane";

        String newInput = Arrays.stream(input.split(""))
                .sorted()
                .collect(Collectors.joining());

        System.out.println("Sorted string is: "+newInput);

    }
}
