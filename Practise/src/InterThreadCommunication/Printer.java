package InterThreadCommunication;

public class Printer {
    private boolean isAvailable = true;

    public synchronized void printDocument(String document) {
        while (!isAvailable) {
            try {
                // If the printer is not available, wait until it becomes available
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Printer is available, so print the document
        System.out.println("Printing document: " + document);

        // Simulate printing time
        try {
            Thread.sleep(1000); // Simulate printing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Document printed, make the printer available again
        isAvailable = true;

        // Notify other threads that the printer is available
        notifyAll();
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        // Create multiple threads representing users trying to print documents
        Thread user1 = new Thread(() -> printer.printDocument("Document 1"));
        Thread user2 = new Thread(() -> printer.printDocument("Document 2"));
        Thread user3 = new Thread(() -> printer.printDocument("Document 3"));

        // Start the threads
        user1.start();
        user2.start();
        user3.start();
    }
}
