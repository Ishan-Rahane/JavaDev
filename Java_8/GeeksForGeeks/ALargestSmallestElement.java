package GeeksForGeeks;

import java.lang.reflect.Array;
import java.util.*;

public class ALargestSmallestElement {
    public static void main(String[] args) {
        int[] array = {1,4,6,9,2,3,1,3,7,4};

        // just the largest element.
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("Largest element is:"+max);

        // 3rd largest element.
        Integer i = Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(2)
                .findFirst().orElseThrow();
        System.out.println("3rd Largest element is:"+i);

        // 3rd smallest element
        Integer i1 = Arrays.stream(array)
                .boxed()
                .sorted()
                .distinct()
                .skip(2)
                .findFirst()
                .orElseThrow();
        System.out.println("3rd Smallest element is:"+i1);

    }
}
