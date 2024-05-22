//Write a Java 8 program to concatenate two Streams?

import java.util.*;
import java.util.stream.Stream;

public class Concatenate {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");

        Stream<String> concat = Stream.concat(list1.stream(), list2.stream());
        concat.forEach(System.out::print);
    }
}
