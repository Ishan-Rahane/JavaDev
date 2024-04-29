package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreams {

    public static void main(String[] args) {

//        Creating streams  in different ways

//        empty stream
        Stream<Object> stream = Stream.empty();

//        array,object or collection
        String names[] = {"Ishan","Raj","Ram","Sham"};
        Stream.of(names).forEach(System.out::println); //one way
        Arrays.stream(names).forEach(System.out::println);  //another way

        IntStream stream1 = Arrays.stream(new int[]{2, 34, 77, 98, 11});
        stream1.forEach(System.out::println);

//        using list or set
        List<Integer> list = List.of(2,12,45,77,91);
        list.stream().forEach(System.out::println);
    }
}
