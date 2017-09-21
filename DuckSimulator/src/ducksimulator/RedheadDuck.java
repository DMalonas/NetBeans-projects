
package ducksimulator;

public class RedheadDuck extends Duck{
    
    public RedheadDuck(){
        super(new Fly(), new Squeak());
    }
    
    @Override
    public String display(){
        return "Redhead Duck";
    }
    
}
