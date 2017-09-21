
package canvassimulation;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;


class MyCanvas extends Canvas{
    @Override public void paint(Graphics g){
   // this is called on a repaint()
        int red = (int) (Math.random()*256);
        int green = (int) (Math.random()*256);
        int blue = (int) (Math.random()*256);
        g.setColor(new Color(red, green, blue));
        g.drawString("Canvas", 20, 20);
        g.fillRect(40, 40, 50, 50);
        System.out.println("height: " + this.getSize().height + "width: " + this.getSize().width);
   } // end of paint method


}
