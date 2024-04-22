package MultiThreading;

public class MultipleThreads2 implements Runnable{

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
        MultipleThreads2 mm = new MultipleThreads2();
        Thread th = new Thread(mm);
        th.start(); //thread 1

        MultipleThreads2 mm1 = new MultipleThreads2();
        Thread th1 = new Thread(mm1);
        th1.start(); //thread 2

        MultipleThreads2 mm2 = new MultipleThreads2();
        Thread th2 = new Thread(mm2);
        th2.start(); //thread 3
    }
}
