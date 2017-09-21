
package showcolors;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ShowColors {

    public static void main(String[] args) {
    
        JFrame frame = new JFrame( "Using colors" );
        ColorJPanel panel = new ColorJPanel();
        frame.add( panel );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 180);
        frame.setVisible(true);
    }
}


class ColorJPanel extends JPanel{
    
    public void paintComponent( Graphics g ){
        this.setBackground( Color.WHITE );
    
        g.setColor( new Color( 255, 0, 0 ) );
        g.fillRect( 15, 25, 100, 20 );
        g.drawString( "Current RGB: " + g.getColor(), 130, 40 );
        
        
        g.setColor( new Color( 0.50f, 0.75f, 0.0f ) );
        g.fillRect( 15, 50, 100, 20 );
        g.drawString( "Current RGB: " + g.getColor(), 130, 65 );
        
        
        g.setColor( Color.BLUE );
        g.fillRect( 15, 75, 100, 20 );
        g.drawString( "Current RGB: " + g.getColor(), 130, 90 );
        
        
        Color color = Color.MAGENTA;
        g.setColor( color );
        g.fillRect( 15, 100, 100, 20 );
        g.drawString( "RGB values: " + color.getRed() + ", " +
                color.getGreen() + ", " + color.getBlue(), 130, 115 );
        
    } 
}
