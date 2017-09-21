
package dogdoorsimulator2;


public class DogDoorSimulator2 {

    public static void main(String[] args) {
        
        DogDoor door = new DogDoor();
        BarkRecogniser recogniser = new BarkRecogniser(door);
        Remote remote = new Remote(door);
        
        System.out.println("\nFido barks to go outside ... ");
        System.out.println("\nFido's all done... ");
        
        
        try {
            Thread.currentThread().sleep(10000);
        }   catch (InterruptedException e) { } 
        
        System.out.println("...but hee's stuck outside!");
        
        System.out.println("\nFido starts barking...");
        recogniser.recognise("Woof");
        
        System.out.println("\nFido's back inside...");
    }
}
