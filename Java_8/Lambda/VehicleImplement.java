package Lambda;

//without lambda

public class VehicleImplement {

    public static void main(String[] args) {

        int speed = 50;

        Vehicle_Without_Lambda v = new Vehicle_Without_Lambda() {
            @Override
            public void ride() {
                System.out.println("Speed of vehicle is: " + speed + " km/h");
            }
        };
        v.ride();
    }

}
