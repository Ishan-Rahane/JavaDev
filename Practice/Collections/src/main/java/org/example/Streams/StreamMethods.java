package org.example.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMethods {

    public static void main(String[] args) {

        System.out.println("---Using Filter()---");
//        filter() -> takes in Predicate as argument and returns boolean value

        //here we filter out countries starting with letter A
        List<String> countries = List.of("India","Afghanistan","Rome","Spain","Australia","France","Russia");
        List<String> a1 = countries.stream().filter(a -> a.startsWith("A")).toList();
        System.out.println(a1);

        //filter() on array
        int [] num = new int[]{23,55,68,12,2,4,7,9,13};
        IntStream intStream = Arrays.stream(num).filter(i -> i % 2 == 0);
        intStream.forEach(System.out::println);

//--------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("---Using Map()---");
//        map() -> takes in Function as argument and returns the element. We perform operations on elements in map()

        //here we perform operations on the number by squaring each element and returning it
        List<Integer> n = List.of(2,4,7,9,13);
        List<Integer> list = n.stream().map(i -> i * i).toList();
        System.out.println(list);

        //map() on array
        int[] number = new int[]{23,55,68,12};
        IntStream array = Arrays.stream(number).map(i -> i * i);
        array.forEach(System.out::println);

//--------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("---Using Sorted()---");
//        sorted() -> sort the elements

        IntStream sorted = Arrays.stream(num).sorted();
        sorted.forEach(System.out::println);

        List<String> list1 = countries.stream().sorted().toList();
        System.out.println(list1);

//--------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("---Using Sorted()---");
//        sorted() -> sort the elements

        IntStream newSorted = Arrays.stream(num).sorted();
        newSorted.forEach(System.out::println);

        List<String> list2 = countries.stream().sorted().toList();
        System.out.println(list2);

//--------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("---Using CompareTo()---");

        List<Integer> min = List.of(23,55,68,12,2,4,7,9,13);
        Integer i = min.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Min "+i);

        Integer ii = min.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("Max "+ii);

    }

}
