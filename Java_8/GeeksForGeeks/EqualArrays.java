package GeeksForGeeks;

import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int[] b = {10,21,30,40,50};

        boolean equals = Arrays.equals(a, b);
        if(equals)
            System.out.println("Arrays are equal");
        else
            System.out.println("Arrays are not equal");
    }
}
