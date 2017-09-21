
package ducksimulator2;

public class DuckSimulator2 {


    public static void main(String[] args) {
        
        
        Duck duck0 = new MallardDuck();
        duck0.performFlyBehaviour();
        duck0.performVoiceBehaviour();
        duck0.setFlyBehaviour(new NotFly());
        duck0.performFlyBehaviour();

        
    }
    
}
