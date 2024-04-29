package BasicPrograms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EvenNumbers {
    public static void main(String[] args) {

        System.out.println("Even numbers are :- ");
        IntStream.rangeClosed(1,100)
                .filter(i->i % 2 == 0)
                .forEach(System.out::println);

        System.out.println("Odd numbers are :- ");
        IntStream.rangeClosed(1,100)
                .filter(i->i % 2 != 0)
                .forEach(System.out::println);
    }
}
