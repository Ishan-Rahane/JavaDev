package org.example.BasicPrograms;

import java.util.Arrays;

public class CountDigits {
    public static void main(String[] args) {
        String num = "AE1234DCS";

        long count = String.valueOf(num)
                .chars()
                .filter(Character::isDigit)
                .count();
        System.out.println("The count of number "+num+" is "+count);
    }
}
