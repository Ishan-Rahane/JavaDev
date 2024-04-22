package Numbers;

public class PrimeNumbersUpto100 {
    public static void main(String[] args) {
        System.out.println("Prime numbers upto 100 are :- ");

        for (int num=2;num<=100;num++){
            int m = num/2;
            int flag=0;

            if (num==0 || num == 1)
                System.out.println("Not a prime number");

            else {
                for (int i=2;i<=m;i++){
                    if (num%i==0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag==0)
                    System.out.println(num+" ");
            }

        }
    }
}
