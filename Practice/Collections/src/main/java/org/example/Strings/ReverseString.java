package org.example.Strings;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Ishan Rahane";

        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        System.out.println("The reverse string is: "+sb);
    }
}
