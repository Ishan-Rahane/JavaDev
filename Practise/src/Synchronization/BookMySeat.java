package Synchronization;

public class BookMySeat {

    int totalSeats = 20;

    synchronized void bookASeat(int seats){
        if(totalSeats >= seats){
            System.out.println("Seat has been booked successfully!!");
            totalSeats = totalSeats-seats;
            System.out.println("Seats remained are: "+totalSeats);
        }
    }
}
