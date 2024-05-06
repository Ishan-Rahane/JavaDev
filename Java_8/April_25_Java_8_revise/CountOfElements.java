package April_25_Java_8_revise;

import java.util.Arrays;

public class CountOfElements {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};

        long count = Arrays.stream(arr).count();
        System.out.println("Count of array elements: "+count);
    }
}
