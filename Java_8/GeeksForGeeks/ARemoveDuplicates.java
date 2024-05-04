package GeeksForGeeks;

import java.util.Arrays;

public class ARemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1,4,6,9,2,3,1,3,7,4};

        int[] array1 = Arrays.stream(array)
                .distinct()
                .toArray();
        System.out.println("Array after removing duplicates: "+Arrays.toString(array1));
    }
}
