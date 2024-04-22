package Numbers;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = scanner.nextLong();
        long reverse=0;
        while (num!=0){
            long i = num % 10;
            reverse = (reverse*10)+i;
            num = num/10;
        }
        System.out.println("The reverse of "+num+" is "+reverse);
    }
}
