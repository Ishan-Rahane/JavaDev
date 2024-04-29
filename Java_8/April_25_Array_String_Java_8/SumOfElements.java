package April_25_Array_String_Java_8;

import java.util.Arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int[]array = {1, 2, 33, 4, 51, 2, 39, 63, 17, 80, 8};

        int sum = Arrays.stream(array).sum();
        System.out.println("Sum of all elements in array: "+sum);
    }
}
