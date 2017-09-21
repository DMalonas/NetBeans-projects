
package ducksimulator;


public class RubberDuck extends Duck{
    
    
    public RubberDuck(){
        super(new NotFly(), new Voiceless());
    }

    @Override
    public String display() {
        return "Rubber Duck";
    }
    
}
