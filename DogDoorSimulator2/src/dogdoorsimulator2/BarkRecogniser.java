
package dogdoorsimulator2;


public class BarkRecogniser {
    
    private DogDoor door;
    
    public BarkRecogniser(DogDoor door) {
        this.door = door; 
    }
    
    public void recognise(String bark) {
        System.out.println(" BarkRecogniser: Heard a " +
                bark + "'");
        door.open();
    }
}
