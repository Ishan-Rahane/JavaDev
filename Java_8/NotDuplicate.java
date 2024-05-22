//Given a String, find the first non-repeated character in it using Stream functions?

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NotDuplicate {

    public static void main(String[] args) {
        String input = "Java articles are Awesome";

        Character c = input.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() == 1)
                .map(e -> e.getKey())
                .findFirst()
                .get();

        System.out.println(c);
    }
}
