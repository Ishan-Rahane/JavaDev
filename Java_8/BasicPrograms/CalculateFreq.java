package BasicPrograms;

import java.util.Scanner;

public class CalculateFreq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (N): ");
        long number = scanner.nextLong();

        // Input for the digit D
        System.out.print("Enter a digit (D): ");
        int digit = scanner.nextInt();

        // Count the occurrences of the digit D in the number N
        long count = String.valueOf(number)
                .chars()
                .mapToObj(c -> (char) c)
                .filter(c -> Character.getNumericValue(c) == digit)
                .count();

        // Display the result
        System.out.println("The digit " + digit + " appears " + count + " times in the number " + number);
    }
}
