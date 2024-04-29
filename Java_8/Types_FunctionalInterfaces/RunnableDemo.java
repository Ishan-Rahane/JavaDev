package Types_FunctionalInterfaces;

public class RunnableDemo {
    public static void main(String[] args) {

        //Anonymous class
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable thread is running");
            }
        };
        Thread t = new Thread(r);
        t.start();


        //Lambda
        Runnable r1 = ()->{
            System.out.println("Even Numbers:");
            for(int i=0;i<=10;i++){
                if (i%2==0){
                    System.out.println(i);
                    try {
                        Thread.sleep(1200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
    }
}