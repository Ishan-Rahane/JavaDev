package April_25_Java_8_revise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class EvenOddNumber {

    public static void main(String[] args) {

        int[] array = IntStream.range(0, 20).filter(w -> w % 2 == 0).toArray();
        System.out.println("Even number are: "+ Arrays.toString(array));

        int[] array1 = IntStream.range(0,20).filter(w->w%2!=0).toArray();
        System.out.println("Odd number are: "+Arrays.toString(array1));

    }
}
