package BasicPrograms;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scanner.nextInt();
        int sum = 0,i;
        int sq = num*num;

        while (sq!=0){
            int digit = sq%10;
            sum = sum+digit;
            sq = sq/10;
        }
        if (num==sum)
            System.out.println("Neon Number");
        else
            System.out.println("Not a neon number");
    }
}
