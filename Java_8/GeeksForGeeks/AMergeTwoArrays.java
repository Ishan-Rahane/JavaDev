package GeeksForGeeks;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AMergeTwoArrays {

    public static void main(String[] args) {

        int[] array = {1, 4, 6, 9, 2, 3, 1, 3, 7, 4};
        int[] a = {10, 20, 30, 40, 50};

        int[] mergedArray = IntStream.concat(Arrays.stream(array), Arrays.stream(a)).toArray();
        System.out.println("Merged array: "+ Arrays.toString(mergedArray));

        int max = Arrays.stream(mergedArray).max().orElse(Integer.MIN_VALUE);
        System.out.println("Largest element in merged array: "+max);
    }
}

//The issue arises because Arrays.stream(array) returns an IntStream, not a Stream<Integer>,
// so it doesn't directly match the type Stream<? extends T> expected by Stream.concat.
// To fix this, you can use IntStream.concat to concatenate two IntStream instances directly