package Strings;

import java.util.Arrays;

public class ConvertToByteArray {
    public static void main(String[] args) {
        String input = "Java";

        byte[] bytes = input.getBytes();
        System.out.println(Arrays.toString(bytes));

    }
}
