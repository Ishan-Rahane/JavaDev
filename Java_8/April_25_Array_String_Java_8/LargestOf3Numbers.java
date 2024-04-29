package April_25_Array_String_Java_8;

import java.util.Arrays;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        int num[]={10,15,20};

        int arrayIsEmpty = Arrays.stream(num).max().orElseThrow(() -> new IllegalArgumentException("Array is empty"));
        System.out.println("Largest number is "+arrayIsEmpty);
    }
}
