
package shapesimulator;


public class ShapeSimulator {


    private static Rectangle getANewRectangle()
    {
        return new Squarre();
    }


    public static void main(String[] args)
    {
        Rectangle myRectangle = getANewRectangle();
        
        myRectangle.setHeight(10);
        myRectangle.setWidth(20);
        
        myRectangle.output();
       
    }
}
