package org.example.Lambda;

public class Threads_Lambda {

    public static void main(String[] args) {

        //Anonymous Class
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable thread is running!");
            }
        };
        Thread t1 = new Thread(r);
        t1.start();


        //Lambda Expression
        Runnable r1 = () -> {
            System.out.println("Second Runnable thread is running!");
        };
        Thread t2 = new Thread(r1);
        t2.start();

    }
}
