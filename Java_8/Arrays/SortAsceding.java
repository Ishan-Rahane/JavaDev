package org.example.Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class SortAsceding {
    public static void main(String[] args) {
        int[] num = {23, 55, 68, 12, 2, 4, 7, 2, 23, 55};

//        sort array in ascending order
        int[] asorted = Arrays.stream(num).sorted().toArray();
        System.out.println("Descending order: "+ Arrays.toString(asorted));

//        sort array in descending order
        int[] array = Arrays.stream(num)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println("Descending order: "+ Arrays.toString(array));

    }
}
