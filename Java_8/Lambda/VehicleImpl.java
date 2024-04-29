package org.example.Lambda;

public class VehicleImpl {

    public static void main(String[] args) {

        int speed = 40;
        Vehicle_With_Lambda v = () -> {
            System.out.println("Speed was increased by "+speed+" km/h on the highway.");
        };
        v.increaseSpeed();
    }
}
