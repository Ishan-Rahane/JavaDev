package Numbers;

import java.util.Scanner;

public class Palindrome {

    private static void isPalindrome(int num) {
        int orignal=num,sum=0;
        while (num>0){
            int i = num % 10;
            sum = (sum*10) + i;
            num = num/10;
        }
        if (orignal == sum)
            System.out.println("Is a Palindrome number");
        else
            System.out.println("Not a palindrome number");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        isPalindrome(num);
    }
}
