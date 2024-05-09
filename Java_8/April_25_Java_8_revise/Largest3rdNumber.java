package April_25_Java_8_revise;

import java.util.Arrays;
import java.util.Comparator;

public class Largest3rdNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 1};

        int large = Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(2)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Not found"));

        System.out.println("Third largest number: "+large);

        int small = Arrays.stream(array)
                .boxed()
                .sorted()
                .distinct()
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Not found"));

        System.out.println("Smallest number: "+small);

    }
}
