package org.example.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {

    public static void flatMapping(){

        List<List<Integer>> number = new ArrayList<>();
        number.add(Arrays.asList(1,2));
        number.add(Arrays.asList(3,4));
        number.add(Arrays.asList(5,6));
        number.add(Arrays.asList(7,8));
        number.add(Arrays.asList(9,10));

        System.out.println("Before flatmapping: "+number);

        //create a stream
        List<Integer> flatmap = number.stream()
                .flatMap(l -> l.stream())
                .collect(Collectors.toList());

        System.out.println("After flatmapping:"+flatmap);
    }

    public static void mapping(){
        List<String> f = new ArrayList<>();
        f.add("Apple");
        f.add("Banana");
        f.add("Orange");
        f.add("Mango");
        f.add("Peach");

        System.out.println("Before mapping:"+f);

        //create a stream
        List list = f.stream()
                .map(m -> m.length())
                .collect(Collectors.toList());

        System.out.println("After mapping:"+list);

    }

    public static void main(String[] args) {

        flatMapping();

        System.out.println();

        mapping();
    }
}
