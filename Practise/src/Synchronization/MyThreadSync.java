package Synchronization;

public class MyThreadSync extends Thread{

    TableSync t;

    MyThreadSync(TableSync t){
        this.t=t;
    }

    @Override
    public void run() {
        t.print(5);
    }
}
