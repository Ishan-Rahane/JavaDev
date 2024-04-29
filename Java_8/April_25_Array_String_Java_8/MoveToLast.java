package April_25_Array_String_Java_8;

import java.util.Arrays;

public class MoveToLast {

    public static void main(String[] args) {
        int[] arr = {1,0,3,0,4,3};
        int n = arr.length;

        Arrays.sort(arr);
        System.out.println("Sorted array: "+ Arrays.toString(arr));

        System.out.println("Zeroes are moved to last index in array: ");
        for (int i = n-1; i >= 0; i--) {
            System.out.println(arr[i]+" ");
        }
    }
}

