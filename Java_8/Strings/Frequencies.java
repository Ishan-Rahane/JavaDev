package Strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequencies {

    public static void main(String[] args) {
        String i = "Hello World";

        Map<Character,Long> count = i.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        count.forEach((ch,c)->
                System.out.println("Character: " + ch + ", Count: " + c));

    }
}
