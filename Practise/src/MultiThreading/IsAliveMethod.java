package MultiThreading;

public class IsAliveMethod implements Runnable{
    @Override
    public void run() {
        for(int i=5;i>0;i--){
            System.out.println("In child thread: "+i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        IsAliveMethod i = new IsAliveMethod();

        Thread th = new Thread(i);
        System.out.println("Child Thread is alive1: "+th.isAlive());
        System.out.println("Main Thread is alive1: "+th.isAlive());

        th.start();

        //you can see the difference by uncommenting below lines and commenting last join()
//        th.join();
//        for(int n=5;n>0;n--){
//            System.out.println("In main thread: "+n);
//            try {
//                Thread.sleep(1500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }

        System.out.println("Child Thread is alive2: "+th.isAlive());
        System.out.println("Main Thread is alive2: "+th.isAlive());

        th.join();

        System.out.println("Child Thread is alive3: "+th.isAlive());
        System.out.println("Main Thread is alive3: "+th.isAlive());

    }
}
