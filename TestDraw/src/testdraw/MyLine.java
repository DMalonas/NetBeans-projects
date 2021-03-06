package testdraw;

import java.awt.Color;
import java.awt.Graphics;

public class MyLine{
    
    private int x1, x2, y1, y2;
    Color color;
    
    public MyLine( int x1, int x2, int y1, int y2, Color color ){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.color = color;
    }
    
    
    public void draw( Graphics g){
        g.setColor( color );
        g.drawLine( x1, y1, x2, y2 );
    }
}