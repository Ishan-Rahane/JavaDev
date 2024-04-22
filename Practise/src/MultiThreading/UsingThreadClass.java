package MultiThreading;

public class UsingThreadClass extends Thread{

    @Override
    public void run() {
        for(int i=5;i>0;i--){
            System.out.println("In child thread: "+i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        UsingThreadClass ut = new UsingThreadClass();
        Thread th1 = new Thread(ut);
        th1.start();

        for(int i=5;i>0;i--){
            System.out.println("In main thread: "+i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
