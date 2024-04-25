package org.example.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAPI {
    public static void main(String[] args) {
//        using array
        int []arr = new int[]{12,55,66,98,37};
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        List<Integer> even = list.stream().filter(x -> x%2==0).toList();
        System.out.println(even);

//        using List
        List<Integer> ls = List.of(12,55,06,98,37,28);
        System.out.println(ls);

        List<Integer> newList = ls.stream()
                .sorted()
                .filter(x -> x%2==0).toList();
        System.out.println(newList);

        List<Integer> l = ls.stream().filter(x->x>60).toList();
        System.out.println(l);




    }
}
