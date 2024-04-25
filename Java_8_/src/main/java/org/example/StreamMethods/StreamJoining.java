package org.example.StreamMethods;

import java.util.*;
import java.util.stream.Collectors;

public class StreamJoining {

    public static void main(String[] args) {

        List<String> str = Arrays.asList("Geeks", "for", "Geeks");

//        Convert the character list into String using Collectors.joining() method
        String chStr = str.stream().collect(Collectors.joining());
        System.out.println(chStr);
    }
}
