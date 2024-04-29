package org.example.Streams;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SetToStream {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(34);
        set.add(56);
        set.add(78);
        set.add(90);

        System.out.println("Set of integer: "+set);

        //convert set to stream
        Stream stream = set.stream();
        System.out.println("Stream of integer: "+set);

    }
}
