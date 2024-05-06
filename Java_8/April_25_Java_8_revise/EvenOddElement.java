package April_25_Java_8_revise;

import java.util.*;

public class EvenOddElement {

    public static void main(String[] args) {
        int[]array = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 8};

        int[] array1 = Arrays.stream(array).filter(n -> n % 2 == 0).toArray();
        int[] array2 = Arrays.stream(array).filter(n -> n % 2 != 0).toArray();

        System.out.println("Print even: "+Arrays.toString(array1));
        System.out.println("Print odd: "+Arrays.toString(array2));

    }
}
