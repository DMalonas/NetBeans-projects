
package ducksimulator;


public class WoodenDuck extends Duck{

    
    public WoodenDuck(){
        super(new NotFly(), new Voiceless());
    }
    
    @Override
    public String display() {
        return "Wooden Duck";
    }
    
}
