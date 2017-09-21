
package rectanglesimulator;


public class Squarre extends Rectangle{
    
    public void setLength(double height){
        fHeight = height; 
        fWidth = height;
    }
    
    @Override
    public void output(){
        System.out.println("Length: " + fHeight + " Area: " + fHeight * fHeight);
    }
}
