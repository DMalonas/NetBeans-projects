
package dogdoorsimulator0;


public class DogDoor {
    
    private boolean open;
    
    public DogDoor() {
        this.open = false;
    }
    
    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }
    
    public void open() {
        System.out.println("The dog door opens.");
        open = true;
    }
    
    
    public boolean isOpen() {
        return open;
    }
}
