package Deadlock;

//let's imagine a scenario involving two friends, Alice and Bob, who both need to use a shared resource: a book and a pen.
// However, they have a quirky habit: they always need to use both the book and the pen together, and they refuse to give up their hold on one until they have both.

//Here's how a deadlock might occur:

//Alice grabs the book.
//Bob grabs the pen.
//Alice realizes she needs the pen as well, so she waits for Bob to finish with it.

// Meanwhile, Bob realizes he needs the book too, so he waits for Alice to finish with it.
// Now, Alice is waiting for Bob to release the pen, and Bob is waiting for Alice to release the book. They're both stuck waiting for each other, and neither can make progress. This situation is called a deadlock.
// In Java, a similar deadlock scenario might occur with threads.
// For example, if one thread holds a lock on object A and waits for a lock on object B, while another thread holds a lock on object B and waits for a lock on object A, they will end up deadlocked.

public class DeadlockExample {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Holding lock on resource1...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for lock on resource2...");
                synchronized (resource2) {
                    System.out.println("Thread 1: Holding lock on resource1 and resource2...");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Holding lock on resource2...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2: Waiting for lock on resource1...");
                synchronized (resource1) {
                    System.out.println("Thread 2: Holding lock on resource2 and resource1...");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
