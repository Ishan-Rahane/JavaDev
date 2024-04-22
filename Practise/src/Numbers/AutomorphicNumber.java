package Numbers;

import java.util.Scanner;

public class AutomorphicNumber {

    private static boolean isAutomorphic(int num) {
        int square = num * num;
        while (num > 0){
            if (num % 10 != square % 10)
            return false;

            num = num/10;
            square = square/10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        System.out.println(isAutomorphic(num)?"Automorphic":"Not Automorphic");
    }
}
