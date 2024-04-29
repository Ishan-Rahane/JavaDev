package April_25_Array_String_Java_8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EvenOddPosition {

    public static void main(String[] args) {

        int[]array = {1, 2, 33, 4, 51, 2, 39, 63, 17, 80, 8};

        System.out.println("Elements at even position: ");
        IntStream.range(0, array.length)
                .filter(i->i%2==0)
                .forEach(i -> System.out.println(array[i]));

        System.out.println("Elements at odd position: ");
        IntStream.range(0, array.length)
                .filter(i->i%2!=0)
                .forEach(i -> System.out.println(array[i]));

    }
}
