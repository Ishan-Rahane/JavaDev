package Numbers;

import java.util.Scanner;

public class SunnyNumber {

    private static boolean isSquare(int num){
        double sqrt = Math.sqrt(num);
        return((sqrt - Math.floor(sqrt)) == 0);
    }

    private static void isSunnyNumber(int num) {
        if (isSquare(num+1))
            System.out.println("It is a Sunny number");
        else
            System.out.println("It is not a Sunny number");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        isSunnyNumber(num);
    }
}
