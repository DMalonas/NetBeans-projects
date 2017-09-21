
package shapesimulator;


public class Shape {
    String colour;
    String getColour()
    {
        return colour;
    }
    void setColour(String colour)
    {
        this.colour = colour;
    }
    void draw()
    {
        System.out.println("Drawing a " + colour + " shape");
    }
    
}
