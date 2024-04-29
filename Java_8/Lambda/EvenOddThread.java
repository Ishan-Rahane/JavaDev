package Lambda;

public class EvenOddThread {
    public static void main(String[] args) {

        Runnable r = ()->{
            System.out.println("Even Numbers:");
            for(int i=0;i<=10;i++){
                if (i%2==0){
                    System.out.println(i);
//                    try {
//                        Thread.sleep(1200);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
                }
            }
        };
        Thread t1 = new Thread(r);
        t1.start();

        Runnable r1 = ()->{
            System.out.println("Odd Numbers:");
            for(int i=0;i<=10;i++){
                if (i%2!=0){
                    System.out.println(i);
//                    try {
//                        Thread.sleep(1200);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
                }
            }
        };
        Thread t2 = new Thread(r1);
        t2.start();
    }
}
