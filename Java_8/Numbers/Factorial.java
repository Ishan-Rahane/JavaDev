package org.example.Numbers;

import java.util.Scanner;

public class Factorial {

    private static void factorial(int num) {
        int fact=1;
        for (int i=1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("The factorial for "+num+"! is "+fact);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        factorial(num);
    }
}
