package org.example.StreamMethods;

import java.util.*;

public class StreamSkip {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        list.stream().skip(2).limit(5).forEach(System.out::println);
    }
}
