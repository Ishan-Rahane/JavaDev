package Synchronization;

public class MyThreadSync2 extends Thread{

    TableSync t;

    MyThreadSync2(TableSync t){
        this.t=t;
    }

    @Override
    public void run() {
        t.print(100);
    }
}
