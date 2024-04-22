package MultiThreading;

public class CurrentThreadDemo {

    public static void main(String[] args) {
        Thread th = Thread.currentThread();

        System.out.println("Current thread: "+th);
        //output = Current thread: Thread[#1,main,5,main]
        //main = default name of thread
        //5 = thread priority
        //main = name of group of thread to which thread belongs

//        change name of thread
        th.setName("My Thread");
        System.out.println("After name change: "+th);

        for (int i=5;i>0;i--){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

                System.out.println("Main thread interruption");
            }
        }
    }
}
