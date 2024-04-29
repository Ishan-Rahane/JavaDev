package April_25_Array_String_Java_8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        int [] num = {23,55,68,12,2,4,7,2,23,55};
        System.out.println("Array in reverse order is: ");

        // Use IntStream.rangeClosed to create a stream of indices in reverse order
        Arrays.stream(IntStream.rangeClosed(1, num.length).toArray())
                .map(i -> num[num.length - i])
                .forEach(e -> System.out.print(e + " "));

    }
}
