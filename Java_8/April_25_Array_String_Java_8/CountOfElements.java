package April_25_Array_String_Java_8;

import java.util.Arrays;

public class CountOfElements {
    public static void main(String[] args) {
        int[]array = {1, 2, 33, 4, 51, 2, 39, 63, 17, 80, 8};

        long count = Arrays.stream(array).count();
        System.out.println("Number of elements present in array: "+count);
    }
}
