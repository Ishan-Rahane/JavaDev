package Synchronization;

public class TestSync {

    public static void main(String[] args) {
        TableSync t = new TableSync();

        MyThreadSync m1 = new MyThreadSync(t);
        m1.start();

        MyThreadSync2 m2 = new MyThreadSync2(t);
        m2.start();
    }
}
