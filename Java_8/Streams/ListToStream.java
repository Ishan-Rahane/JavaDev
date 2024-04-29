package org.example.Streams;

import java.util.*;
import java.util.stream.Stream;

public class ListToStream {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Cricket","Football","Hockey");

        System.out.println("List: " + list);

        // Convert List to stream
        Stream<String> stream = list.stream();
        System.out.println("Stream from List: "+ Arrays.toString(stream.toArray()));
    }
}
