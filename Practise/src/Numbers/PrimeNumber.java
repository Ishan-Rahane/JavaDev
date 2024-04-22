package Numbers;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int m = num/2;
        int flag=0;

        if (num==0 || num == 1)
            System.out.println("Not a prime number");

        else {
            for (int i=2;i<=m;i++){
                if (num%i==0) {
                    System.out.println("Not a prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag==0)
                System.out.println("Is a prime number");
        }
    }

}
