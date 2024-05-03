package April_25_Array_String_Java_8;

import java.util.stream.Collectors;

public class SLowerUpperCase {
    public static void main(String[] args) {
        String input = "Hello World";

        String collect = input.chars()
                .mapToObj(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c))
                .map(ch -> String.valueOf((char) ch.intValue()))
                .collect(Collectors.joining());

        System.out.println(collect);
    }
}
