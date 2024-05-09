package April_25_Java_8_revise;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EvenOddPosition {
    public static void main(String[] args) {

        int[]array = {1, 2, 33, 4, 51, 2, 39, 63, 17, 80, 8};

        System.out.println("Elements on Even index: ");
        IntStream.range(0, array.length).filter(e->e%2==0).forEach(i-> System.out.println(array[i]));

        System.out.println("Elements on Odd index: ");
        IntStream.range(0, array.length).filter(e->e%2!=0).forEach(i-> System.out.println(array[i]));
    }
}
