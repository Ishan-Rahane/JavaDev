package Numbers;

import java.util.Scanner;

public class Fibonacci {

    private static void fibonacci(int num) {
        int i=0,j=1,k;
        for (int a=2;a<=num;a++){
            k=i+j;
            System.out.println(" "+k);
            i=j;
            j=k;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        fibonacci(num);
    }
}
