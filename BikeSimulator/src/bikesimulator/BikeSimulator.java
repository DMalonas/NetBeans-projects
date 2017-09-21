
package bikesimulator;


public class BikeSimulator {


    public static void main(String[] args) {
    IRepairBehaviour myBike = new Bike();
    myBike.repair();
    Bike bike = new Bike();
    bike.breakBike();
    bike.repair();

    
    }
    
}
