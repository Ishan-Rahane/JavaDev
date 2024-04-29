package April_25_Array_String_Java_8;

import java.util.stream.IntStream;

public class EvenNumber {

    public static void main(String[] args) {
        System.out.println("Even Numbers:");
        IntStream.range(1,20).filter(e->e%2==0).forEach(System.out::println);
        System.out.println("\nOdd Numbers:");
        IntStream.range(1,20).filter(e->e%2!=0).forEach(System.out::println);
    }
}
