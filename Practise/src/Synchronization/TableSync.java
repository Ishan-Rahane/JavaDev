package Synchronization;

public class TableSync {

    synchronized void print(int n){
        for (int i = 0; i <= 10; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
