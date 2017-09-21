
package shapes2;

import com.sun.prism.paint.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.Color;


public class Shapes2 {


    public static void main(String[] args) {
        
    }
    
}



class ShapesJPanel extends JPanel{
    
    public void paintComponent( Graphics g ){
        super.paintComponent(g);
        
        Graphics2D g2d = ( Graphics2D )g;
        g2d.setPaint( new GradientPaint( 5, 30, Color.BLUE, 35, 100, Color.YELLOW, true) );
        
    }
}
