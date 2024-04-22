package MultiThreading;

public class UsingRunnableInterface implements Runnable{
    @Override
    public void run() {
        for(int i=5;i>0;i--){
            System.out.println("In child thread: "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        UsingRunnableInterface u = new UsingRunnableInterface();
        Thread th = new Thread(u);
        th.start();

        for(int i=5;i>0;i--){
            System.out.println("In main thread: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
