
package rectanglesimulator;


public class Rectangle {
    
    protected double fHeight; 
    protected double fWidth; 
    
    
    public void setHeight(double fHeight){
        this.fHeight = fHeight;
    }
    
    public void setWidth(double fWidth){
        this.fWidth = fWidth; 
    }
    
    public void output(){
        System.out.println("Height: " + fHeight + " Width: " + fWidth +" Area: "
                            + fHeight * fWidth);
    }
}
