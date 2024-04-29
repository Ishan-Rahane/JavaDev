package Strings;

import java.util.Arrays;

public class Count {

    public static void main(String[] args) {
        String s = "JavaPython";

        long count = Arrays.stream(s.split(""))
                .count();
        System.out.println(count);
    }
}
