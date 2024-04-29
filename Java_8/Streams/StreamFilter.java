package Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {

    public static void filterByEvenElements(){
        Integer[] arr = new Integer[] {1,2,3,4,5,6,7,8,9,10};

        //create a stream and then filter
        Stream.of(arr)
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }

    public static void filterByStartWith(){
        String [] sarr = new String[] {"Ajay","Vijay","Anand","Ram","Raj","Sham"};

        //create a stream
        Stream.of(sarr)
                .filter(x -> x.startsWith("A"))
                .forEach(System.out::println);
    }

    public static void filterByStartsWithVowel(){
        String []sarr = "Hi, my name is Ishan. Today it's been two year in Hoonartek" .split(" ");

        //create a stream
        Stream.of(sarr)
                .filter(x -> x.matches("(a|e|i|o|u)\\w*"))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        filterByEvenElements();
        System.out.println();

        filterByStartWith();
        System.out.println();

        filterByStartsWithVowel();

    }
}
