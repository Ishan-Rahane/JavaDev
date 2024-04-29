package April_25_Array_String_Java_8;

import java.util.Arrays;

public class SecondLargestSmallestElement {

    public static void main(String[] args) {
        int[]array = {1, 2, 33, 4, 51, 2, 39, 63, 17, 80, 8};

        int secondL = Arrays.stream(array)
                .boxed()//Convert int To Integer

                .sorted((a, b) -> Integer.compare(b, a))// Sort in descending order

                .distinct()//remove duplicates

                .skip(1)// Skip first element to fetch the second one

                .findFirst()// Find the first element, which is now the second largest

                .orElseThrow(() -> new IllegalArgumentException("Array is too small"));

        System.out.println("Second largest element is: "+secondL);

        ////////////////////////////

        int secondS = Arrays.stream(array)

                .sorted()// Sort in ascending order

                .distinct()//remove duplicates

                .skip(1)// Skip first element to fetch the second one

                .findFirst()// Find the first element, which is now the second largest

                .orElseThrow(() -> new IllegalArgumentException("Array is too large"));

        System.out.println("Second smallest element is: "+secondS);


    }
}
