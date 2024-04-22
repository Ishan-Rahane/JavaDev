package Numbers;

import java.util.Scanner;

public class PetersonNumber {

    private static int factorial(int num) {
        int fact=1;
        for (int i = 1; i<= num; i++){
            fact = fact*i;
        }
        return fact;
    }

    private static void isPeterson(int num) {
        int originalNum = num;
        int sum = 0;
        while (num>0){
            int i = num % 10;
            sum+=factorial(i);
            num = num/10;
        }
        if (sum == originalNum)
            System.out.println("It is a Peterson number");
        else
            System.out.println("It is not a Peterson number");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        factorial(num);
        isPeterson(num);
    }

}
