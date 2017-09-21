
package ducksimulator2;


public class MallardDuck extends Duck{
    
    public MallardDuck(){
        super(new Fly(), new Quack());
    }

    @Override
    public String display() {
       return "Mallard Duck ";
    }
    
}
