package April_25_Java_8_revise;

import java.util.Arrays;

public class MoveToLast {
    public static void main(String[] args) {
        int[] arr = {1,0,3,0,4,3};
        Object[] array = Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> Integer.compare(b, a)).toArray();
        System.out.println(Arrays.toString(array));
    }
}
