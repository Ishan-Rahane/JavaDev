package April_25_Array_String_Java_8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SDivideStringInNNumbers {
    public static List<String> divideString(String input, int parts) {
        int length = input.length();
        int partLength = (int) Math.ceil((double) length / parts);

        return IntStream.range(0, parts)
                .mapToObj(i -> input.substring(i * partLength, Math.min((i + 1) * partLength, length)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String input = "This is a sample string to divide into parts";
        int parts = 5;

        List<String> dividedStrings = divideString(input, parts);
        System.out.println("Divided strings:");
        dividedStrings.forEach(System.out::println);
    }
}
