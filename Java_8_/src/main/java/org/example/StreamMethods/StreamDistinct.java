package org.example.StreamMethods;

import java.util.*;

public class StreamDistinct {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);

        System.out.println("The distinct elements are :");
        list.stream().distinct().forEach(System.out::println);

        ////////////////////////////////////////////////////////////////////////
        List<String> list1 = Arrays.asList("Geeks", "for", "Geeks","GeeksQuiz", "for", "GeeksforGeeks");

        System.out.println("The distinct elements are :");
        list1.stream().distinct().forEach(System.out::println);

    }
}
