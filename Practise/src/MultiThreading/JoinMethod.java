package MultiThreading;

//So, in your main() method, when you call th.join(), the main thread will pause its execution at that point
//and wait for the child thread (th) to finish before continuing.
//Once the child thread completes its execution,
//the main thread will resume its execution from where it left off after the join() call.

//This ensures that the main thread doesn't proceed with its tasks until the child thread has finished its work.
//It's a way to synchronize the execution of multiple threads.

public class JoinMethod implements Runnable{

        @Override
        public void run() {
            for(int i=5;i>0;i--){
                System.out.println("In child thread: "+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public static void main(String[] args) throws InterruptedException {
            JoinMethod u = new JoinMethod();
            Thread th = new Thread(u);
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

            th.join();

            System.out.println("Main Thread is terminated");

        }
    }


