package April_25_Array_String_Java_8;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};

        int[] array = Arrays.stream(arr).toArray();
        System.out.println("Original array:"+Arrays.toString(arr));
        System.out.println("newly copied array:"+Arrays.toString(array));
    }
}
