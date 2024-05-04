package GeeksForGeeks;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};

        int[] array = Arrays.stream(a).toArray();
        System.out.println("Original array: "+Arrays.toString(a));
        System.out.println("Copied array: "+Arrays.toString(array));
    }
}
