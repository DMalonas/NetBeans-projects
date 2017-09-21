
package rectanglesimulator;


public class RectangleSimulator {

    public static Rectangle getARectangle(){
        return new Rectangle();
    }
    
    public static Squarre getASquarre(){
        return new Squarre();
    }
    
    public static Rectangle_2 getARectangleOrASquarre(){
        return new Rectangle_2();
    }
    
    
    public static void main(String[] args) {
    
       Rectangle myRectangle = getARectangle();
       myRectangle.setHeight(10.0);
       myRectangle.setWidth(20.0);
       myRectangle.output();
       Squarre mySquarre = getASquarre(); 
       mySquarre.setLength(20.0);
       mySquarre.output();
       
       
       Rectangle_2 myRectangleOrSquarre = getARectangleOrASquarre();
       myRectangleOrSquarre.setWidth(10.0);
       myRectangleOrSquarre.setHeight(20.0);
       myRectangleOrSquarre.output();
       myRectangleOrSquarre.printNumberOfObjects();
       myRectangleOrSquarre.setWidth(20.0);
       myRectangleOrSquarre.setHeight(20.0);

       myRectangleOrSquarre.setHeight(10.0);
       myRectangleOrSquarre.setWidth(20.0);
       myRectangleOrSquarre.output();
       myRectangleOrSquarre.printNumberOfObjects();

    
    }
    
}
