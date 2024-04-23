package StaticSynchronization;

public class MainClass {

    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        MyThread2 m2 = new MyThread2();
        MyThread3 m3 = new MyThread3();
        MyThread4 m4 = new MyThread4();

        m1.start();
        m2.start();
        m3.start();
        m4.start();
    }
}
