package April_25_Array_String_Java_8;

import java.util.Arrays;

public class EvenOddElements {
    public static void main(String[] args) {
        int[]array = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 8};


//        int[] array1 = Arrays.stream(array)
//                .filter(n -> n % 2 == 0)
//                .toArray();
//        System.out.println("Even elements are: "+Arrays.toString(array1));
//
//        int[] array2 = Arrays.stream(array)
//                .filter(n -> n % 2 != 0)
//                .toArray();
//        System.out.println("Odd elements are: "+Arrays.toString(array2));

        System.out.println("Odd elements are: ");
        Arrays.stream(array)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("Odd elements are: ");
        Arrays.stream(array)
                .filter(n->n%2!=0)
                .forEach(System.out::println);
    }
}
