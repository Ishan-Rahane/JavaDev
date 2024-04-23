package StaticSynchronization;

public class MyThread2 extends Thread{

    @Override
    public void run() {
        Table.print(10);
    }
}
