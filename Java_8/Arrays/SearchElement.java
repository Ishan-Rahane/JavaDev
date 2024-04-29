package org.example.Arrays;

import java.util.Arrays;

public class SearchElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 3, 23, 55, 68, 12, 2, 4, 7, 2, 23, 55};

        int toSearch = 5;

        boolean b = Arrays.stream(array).anyMatch(e -> e == toSearch);

        if(b)
            System.out.println("Element "+toSearch+" has been found");
        else
            System.out.println("Element "+toSearch+" has not been found");

    }
}
