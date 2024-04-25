package org.example.Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;

public class SecondLargest {
    public static void main(String[] args) {
        int[] num = {23, 55, 68, 12, 2, 4, 7, 2, 23, 55};

        Optional<Integer> secondLargest = Arrays.stream(num)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst();

        if(secondLargest.isPresent())
            System.out.println("The second largest element is: " + secondLargest.orElse(null));

        else
            System.out.println("No such element found!");


    }
}
