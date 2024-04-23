package InterThreadCommunication;

public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        notify(); // Notify any waiting thread that the count has changed
    }

    public synchronized int getCount() {
        return count;
    }


    public static void main(String[] args) {
        Counter counter = new Counter();

        // Thread 1 increments the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
                System.out.println("Thread 1: Incremented counter to " + counter.getCount());
                try {
                    Thread.sleep(1000); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread 2 waits for the counter to reach a certain value
        Thread thread2 = new Thread(() -> {
            synchronized (counter) {
                while (counter.getCount() < 3) {
                    try {
                        System.out.println("Thread 2: Waiting for counter to reach 3");
                        counter.wait(); // Wait until notified
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Thread 2: Counter reached 3!");
            }
        });

        thread1.start();
        thread2.start();
    }
}