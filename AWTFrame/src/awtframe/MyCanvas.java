
package awtframe;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;


public class MyCanvas extends Canvas {
    
    @Override 
    public void paint(Graphics g) {
        int red = (int) (Math.random()*256);
        int green = (int) (Math.random()*256);
        int blue = (int) (Math.random()*256);
        g.setColor(new Color(red, green, blue));
        g.drawString("Canvas", 20, 20);
        g.fillRect(40,40,40,40);
    }
    
}
