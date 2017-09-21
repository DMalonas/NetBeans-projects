
package ducksimulator;


public class DuckSimulator {


    public static void main(String[] args) {

        Duck myDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck rubberDuck = new RubberDuck();
        
        
        System.out.println(myDuck.display());
        myDuck.performFlyBehaviour();
        myDuck.performVoiceBehaviour();
        System.out.println(redheadDuck.display());
        redheadDuck.performFlyBehaviour();
        redheadDuck.performVoiceBehaviour();
        System.out.println(woodenDuck.display());
        woodenDuck.performFlyBehaviour();
        woodenDuck.performVoiceBehaviour();
        System.out.println(rubberDuck.display());
        rubberDuck.performFlyBehaviour();
        rubberDuck.performVoiceBehaviour();
        
    }
    
}
