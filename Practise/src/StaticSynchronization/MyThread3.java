package StaticSynchronization;

public class MyThread3 extends Thread{

    @Override
    public void run() {
        Table.print(100);
    }
}
