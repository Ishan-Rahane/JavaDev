package BasicPrograms;

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int sq = num*num;
        int digit;
        while(sq!=0){
            digit = (sq%10) + (sq/10);
            if (num==digit)
                System.out.println("Automorphic number");
            else
                System.out.println("Not an Automorphic number");

        }
    }
}
