package April_25_Array_String_Java_8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertArrayToString {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,54,5};
        String collect = Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
