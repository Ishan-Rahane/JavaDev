package StaticSynchronization;

public class Table {

    synchronized static void print(int n){
        for (int i = 0; i <= 5; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
