package April_25_Array_String_Java_8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LargestSmallestElement {

    public static void main(String[] args) {
        int[]array = {1, 2, 33, 4, 51, 2, 39, 63, 17, 80, 8};

        int largest = Arrays.stream(array).max().orElse(Integer.MIN_VALUE);
        System.out.println("Largest element is: "+largest);

        int smallest = Arrays.stream(array).min().orElse(Integer.MAX_VALUE);
        System.out.println("Smallest element is: "+smallest);
    }
}
