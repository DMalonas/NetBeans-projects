
package shapesimulator;


public class Rectangle
{
    protected double fWidth;
    protected double fHeight;
    
    public void setHeight(double height)
    {
        this.fHeight = height;
    }
    public void setWidth(double width)
    {
        this.fWidth = width;
    }
    public void output()
    {
        System.out.println("fWidth: " + fWidth + " fHeight: " + fHeight + " area: " + fWidth * fHeight);
    }
    
}
