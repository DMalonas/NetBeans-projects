
package bikesimulator;


public class Bike implements IRepairBehaviour{

    public Bike(){
        System.out.println("Create a bike");
    }
    

    @Override
    public void repair() {
       System.out.println("Repair Bike");
    }

    public void breakBike(){
        System.out.println("Break bike");
    } 
        
}
