package Numbers;

import java.util.Scanner;

public class PalindromeNumber {

    private static boolean isPalindrome(int num) {
        int originalNumber=num;
        int rev = 0;
        while (num != 0) {  //890
            int i = num % 10;  //0
            rev = (rev * 10) + i;  //0
            num = num / 10; //89
        }
        return originalNumber == rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number");
        } else
            System.out.println(num + " is not palindrome number");
    }
}

