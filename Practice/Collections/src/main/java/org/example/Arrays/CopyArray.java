package org.example.Arrays;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int []sourceArray = new int[]{12,55,66,98,37};

        // Using Java 8 features to copy elements
        int[] destinationArray = Arrays.stream(sourceArray).toArray();

        // Display the contents of both arrays
        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Destination Array: " + Arrays.toString(destinationArray));
    }
}
