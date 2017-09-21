
package rectanglesimulator;


public class Rectangle_2 extends Rectangle{
    
    private static int squarre_counter =0, 
                       rectangle_counter =0;
    
    public Rectangle_2(){
        if(this.fHeight == this.fWidth)
            squarre_counter++;
        else
            rectangle_counter++;
    }
    


    
    @Override 
    public void setHeight(double fHeight){
        this.fHeight = fHeight;
        
    }
    
    @Override 
    public void setWidth(double fWidth){
        this.fWidth = fWidth; 
    }
    
    public void printNumberOfObjects(){
        System.out.println("Squares : " + squarre_counter + "\n"
                + "Rectangles : " + rectangle_counter + "\n");
    }
    
    @Override 
    public void output(){
        if(this.fHeight == this.fWidth)
            System.out.println("Create a squarre with area : "+ fHeight * fWidth + "\tSide: " + fHeight);
        else
            System.out.println("Create a rectangle with area: "+ fHeight * fWidth + "\tHeight: " + fHeight + "\tWidth: " + fWidth +"\n");
    }
    
}
