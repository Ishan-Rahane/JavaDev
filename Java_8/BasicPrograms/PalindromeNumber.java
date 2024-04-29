package BasicPrograms;

import java.util.Comparator;
import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int sum=0;
        int r = 0;
        int temp=n;
        
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }

        if(temp==sum)
            System.out.println("Palindrome number");
        else
            System.out.println("Not palindrome");
*/


        System.out.println("Enter a string: ");
        String s = scanner.nextLine();
        int length = s.length();
        String reverse="";

        for (int i = length-1   ; i>=0 ; i--) {
            reverse = reverse+s.charAt(i);
        }

        if (s.equals(reverse))
            System.out.println("Palindrome String");
        else
            System.out.println("Not Palindrome");
    }
}
