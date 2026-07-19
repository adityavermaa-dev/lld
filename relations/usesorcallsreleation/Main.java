package relations.usesorcallsreleation;

public class Main {
    public static void main(String args[]){
        ParkingSpot spot1 = new ParkingSpot();
        Vehicle bmw = new Vehicle("UP14A8055");
        spot1.parkVehicle(bmw);
        spot1.removeVehicle(bmw);
    }
}
