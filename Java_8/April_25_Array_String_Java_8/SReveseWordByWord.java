package April_25_Array_String_Java_8;

import java.util.Arrays;

public class SReveseWordByWord {
    public static void main(String[] args) {
        String input = "Hello World";

        String s = Arrays.stream(input.trim().split("\\s+"))
                .reduce((word1, word2) -> word2 + " " + word1)
                .orElse("");
        System.out.println(s);
    }
}
