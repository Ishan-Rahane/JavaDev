package InterThreadCommunication;

public class Customer {
    int amount = 10000;

     synchronized void withdraw(int amount){
        System.out.println("Going to withdraw...");

        if (this.amount<amount){
            System.out.println("No sufficient balance");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.amount=amount;
        System.out.println("Withdrawl successful!!");
    }

     synchronized void deposit(int deposit){
        System.out.println("Going to deposit...");
        this.amount+=amount;
        System.out.println("Deposit successful!!");
        notify();
    }

    public static void main(String[] args) {
        Customer c = new Customer();
        new Thread(){
            @Override
            public void run() {
                c.withdraw(20000);
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                c.deposit(5000);
            }
        }.start();
    }
}
