package org.example.BasicPrograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 5987,rev=0;
        while(num!=0) {
            int i = num % 10;
            rev = (rev * 10) + i;
            num = num / 10;
        }
        System.out.println("The reverse of number "+num+" is "+rev);
    }
}

