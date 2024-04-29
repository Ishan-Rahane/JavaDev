package April_25_Array_String_Java_8;

import java.util.Scanner;
import java.util.function.Predicate;

public class PosiNegi {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = s.nextInt();

        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isNegative = n -> n < 0;

        if (isPositive.test(number)) {
            System.out.println("The number is positive.");
        } else if (isNegative.test(number)) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
