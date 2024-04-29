package April_25_Array_String_Java_8;

import java.util.Arrays;

public class ReverseSortedArray {

    public static void main(String[] args) {
        int[] arr = {20,30,10,40,50};

        int[] array = Arrays.stream(arr)
                .boxed() // Convert int to Integer
                .sorted((a, b) -> Integer.compare(b,a)) // Reverse order
                .mapToInt(Integer::intValue) // Convert back to int
                .toArray();

        System.out.println("Original array: "+ Arrays.toString(arr));
        System.out.println("Reverse array: "+ Arrays.toString(array));
    }
}
