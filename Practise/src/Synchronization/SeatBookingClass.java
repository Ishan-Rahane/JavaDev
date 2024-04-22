package Synchronization;

public class SeatBookingClass extends Thread{

    static BookMySeat b;
    int seats;

    @Override
    public void run() {
        b.bookASeat(seats);
    }

    public static void main(String[] args) {
        b = new BookMySeat();

        SeatBookingClass s = new SeatBookingClass();
        s.seats=5;
        s.start();

        SeatBookingClass s1 = new SeatBookingClass();
        s1.seats=10;
        s1.start();

    }
}
