package org.example.Streams;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//filter by alternate elements
public class StreamFilterByObjectIndex {

    public static void filterByObjectIndex(){
        String [] sarr = new String[] {"Ajay","Vijay","Anand","Ram","Raj","Sham","Ishan","Lala"};

        //create a atomic integer
        AtomicInteger i = new AtomicInteger(0);

        //create a stream
        Stream.of(sarr)
                .filter(x -> i.getAndIncrement() %2 == 0)
                .forEach(System.out::println);

        System.out.println();

        //by intstream way
        IntStream.rangeClosed(0, sarr.length - 1)
                .filter(x -> x % 2 == 0)
                .mapToObj(x -> sarr[x])
                .forEach(System.out::println);

    }

    public static void main(String[] args) {

        filterByObjectIndex();
    }

}
