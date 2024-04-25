package org.example.BasicPrograms;

import java.util.Arrays;

public class LargestNumber {

    private static int findLargest(int ... numbers) {
        return Arrays.stream(numbers)
                .max()
                .orElseThrow(()-> new IllegalArgumentException());
    }


    public static void main(String[] args) {
        int a=10;
        int b=-20;
        int c=5;

        int largestNo = findLargest(a,b,c);
        System.out.println("Largest number is :- "+largestNo);
    }

}
