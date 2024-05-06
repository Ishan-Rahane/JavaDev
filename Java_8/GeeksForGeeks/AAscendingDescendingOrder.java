package GeeksForGeeks;

import java.util.Arrays;
import java.util.Comparator;

public class AAscendingDescendingOrder {
    public static void main(String[] args) {
        int[] a = {1, 4, 6, 9, 2, 3, 1, 10, 3, 7, 4, 10, 20, 30, 40, 50};

        int[] asc = Arrays.stream(a).sorted().toArray();
        System.out.println("Ascending order: "+Arrays.toString(asc));

        Integer[] des = Arrays.stream(asc).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        System.out.println("Descending order: "+Arrays.toString(des));
    }
}
