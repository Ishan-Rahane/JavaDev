package StaticSynchronization;

public class MyThread1 extends Thread{

    @Override
    public void run() {
        Table.print(1);
    }
}
