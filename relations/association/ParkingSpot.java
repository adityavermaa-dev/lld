package relations.association;

public class ParkingSpot {
    private int spotNumber; 
    public Vehicle parkedVehicle;

    public void parkVehicle(Vehicle vehicle){
        this.parkedVehicle = vehicle;
        System.out.println("Vehicle is parked");
    }

    public void removeVehicle(Vehicle vehicle){
        this.parkedVehicle = null;
        System.out.println("Vehicle is removed");
    }
}
