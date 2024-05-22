package April_25_Array_String_Java_8;

import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {
        String s = "Robed";
        String s1 = "Bored";

        s = s.toLowerCase();
        s1 = s1.toLowerCase();

        boolean equals = Arrays.equals(s.chars().sorted().toArray(), s1.chars().sorted().toArray());

        if(equals)
            System.out.println("Anagram");
        else
            System.out.println("Not anagram");

    }
}
