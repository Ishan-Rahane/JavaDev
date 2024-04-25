package org.example.Arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {
        int [] num = new int[]{23,55,68,12,2,4,7,2,23,55};

        Map<Integer,Long> collect = Arrays.stream(num).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("Element frequencies: ");
        collect.forEach((element,freq)-> System.out.println(element+":"+freq));

    }
}
