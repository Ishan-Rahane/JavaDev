package StaticSynchronization;

public class MyThread4 extends Thread{

    @Override
    public void run() {
        Table.print(1000);
    }
}
