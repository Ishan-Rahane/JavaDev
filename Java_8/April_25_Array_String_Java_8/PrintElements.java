package April_25_Array_String_Java_8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrintElements {
    public static void main(String[] args) {
        Integer[]array = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 8};

        Arrays.stream(array).forEach(System.out::println);

        //Print with index
        IntStream.range(0, array.length).forEach(i -> System.out.println("Index: " + i + ", Value: " + array[i]));

    }
}
