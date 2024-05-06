package GeeksForGeeks;

import java.util.Arrays;

public class ARemoveOccurenceOfAnElement {
    public static void main(String[] args) {
        int[] array = {1,4,6,9,2,3,1,3,7,4};

        int[] array1 = Arrays.stream(array).filter(e -> e != 1).toArray();
        System.out.println("Removing occurences of an element, new array is: "+Arrays.toString(array1));
    }
}
