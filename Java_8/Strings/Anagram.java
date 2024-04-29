package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "Listen";
        String r = "Silent";

        s = s.toLowerCase();
        r = r.toLowerCase();

        boolean anagrams = Arrays.equals(s.chars().sorted().toArray(), r.chars().sorted().toArray());

        if(anagrams)
            System.out.println("Strings are anagrams");
        else
            System.out.println("Strings are anagrams");
    }
}
