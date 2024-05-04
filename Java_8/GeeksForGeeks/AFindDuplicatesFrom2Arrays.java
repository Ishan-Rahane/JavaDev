package GeeksForGeeks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AFindDuplicatesFrom2Arrays {
    public static void main(String[] args) {
        int[] a = {1, 4, 6, 9, 2, 3, 1, 10, 3, 7, 4};
        int[] b = { 10, 20, 30, 40, 50};

        int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
        System.out.println("Merged array: "+Arrays.toString(array));

        // Find duplicates
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(array)
                .filter(n -> !set.add(n)) // if it's already in set, it's a duplicate
                .boxed() // convert int to Integer
                .collect(Collectors.toSet());
        System.out.println("Duplicates from merged array are: "+duplicates);
    }
}

// Duplicates are found by using a Set to keep track of elements encountered so far.
// If an element is already in the set, it's considered a duplicate.
//The duplicates are collected into a Set<Integer> using the Collectors.toSet() collector.