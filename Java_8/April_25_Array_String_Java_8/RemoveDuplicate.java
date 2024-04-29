package April_25_Array_String_Java_8;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[]array = {1, 2, 33, 4, 51, 2, 39, 63, 17, 80, 4};

        int[] dup = Arrays.stream(array)
                .distinct()
                .toArray();

        System.out.println("New array after removing duplicate elements is: "+Arrays.toString(dup));

    }
}
