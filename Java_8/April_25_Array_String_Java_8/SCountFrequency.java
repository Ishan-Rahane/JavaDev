package April_25_Array_String_Java_8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SCountFrequency {
    public static void main(String[] args) {
        String str = "Ishan Rahane";

        Map<Character, Long> charCount = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charCount.forEach((character, count) -> System.out.println(character + ": " + count));
    }
}
