package org.example.Arrays;

public class EvenPositionElement {
    public static void main(String[] args) {
        int[] num = {23, 55, 68, 12, 2, 4, 7, 2, 23, 55};

        System.out.println("Original array");
        for(int i=0; i < num.length; i++){
            System.out.println(num[i]);
        }

        System.out.println("Elements in even position in array");
        for (int i = 0; i < num.length; i = i+2) {
            System.out.println(num[i]);
        }

        System.out.println("Elements in odd position in array");
        for (int i = 1; i < num.length; i = i+2) {
            System.out.println(num[i]);
        }
    }
}
