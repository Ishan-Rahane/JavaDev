package MultiThreading;

public class MultipleThreads implements Runnable{

    String name;
    Thread t;
    public MultipleThreads(String name) {
        this.name = name;
        t = new Thread(this,name);
        System.out.println("New Thread: "+t);
    }

    @Override
    public void run() {
        for(int i=5;i>0;i--){
            System.out.println(name+": "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name+" exiting!");
    }

    public static void main(String[] args) {
        MultipleThreads m = new MultipleThreads("Alpha");
        MultipleThreads m1 = new MultipleThreads("Beta");
        MultipleThreads m2 = new MultipleThreads("Gamma");

        m.t.start();
        m1.t.start();
        m2.t.start();

        try {
             Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
            }
        System.out.println("Main thread exit!");
    }
}
