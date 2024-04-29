package April_25_Array_String_Java_8;

import java.util.stream.IntStream;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int sum = IntStream.range(1, 5).sum();
        System.out.println("Sum of natural numbers: "+sum);
    }
}
