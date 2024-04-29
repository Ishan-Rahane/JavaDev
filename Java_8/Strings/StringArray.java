package Strings;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String input = "This is sample String"; //convert string into string array

        String[] newString = Arrays.stream(input.split("\\s+"))
                .toArray(String[]::new);

        System.out.println(Arrays.toString(newString));
    }
}
