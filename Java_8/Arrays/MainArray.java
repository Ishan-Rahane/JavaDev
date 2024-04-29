package Arrays;

import java.util.Arrays;

public class MainArray {
    public static void main(String[] args) {
        int[] numbers = {10, 7, 23, 45, 67, 3, 89, 100, 5};

        // Using Arrays.stream() and max() function
        int maxNumber = Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
        System.out.println("Largest number in the array: " + maxNumber);

        // Using Arrays.stream() and reduce() function
        int maxNumber2 = Arrays.stream(numbers).reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("Largest number in the array: " + maxNumber2);

        Arrays.stream(numbers).reduce(Integer.MIN_VALUE, Integer::max);
    }
}
