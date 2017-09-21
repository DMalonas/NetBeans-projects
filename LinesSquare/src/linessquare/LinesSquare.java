
package linessquare;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class LinesSquare extends JPanel{
    
    public  void paintComponent(Graphics g){
       
        super.paintComponent(g);
        
        int width = getWidth(), height = getHeight(), counter = 0, factor = 25 ;
        

        while( factor != 250 ){
            //prototype
           //g.drawLine( 0, 0, 250 - factor, factor );
           // g.drawLine( 0, 250, factor, factor );
           // g.drawLine( 250, 250, factor, 250 - factor );
           // g.drawLine( 250, 0, factor, factor );
            
            
            //randomDesign its the left eye
            g.drawLine( 300, 250, 550 - factor, 250 + factor );
            g.drawLine( 300, 500, 550 - factor, 500 - factor );
            g.drawLine( 550, 500, 300 + factor, 500 - factor );
            g.drawLine( 550, 250, 300 + factor, 250 + factor );
            
            
            //leftToRightDesigned
            g.drawLine( 700, 250, 950 - factor, 250 + factor ); 
            g.drawLine( 700, 500, 700 + factor, 250 + factor );
            g.drawLine( 950, 500, 700 + factor, 500 - factor );
            g.drawLine( 950, 250, 950 - factor, 500 - factor );
            
            
             //leftToRightDesigned
            //leftUpperCorner
            //g.drawLine( )
            //leftUpperCorner
            g.drawLine( factor, 0, 250, factor );
            //leftDownCorner
            g.drawLine( 250 - factor, 0, 0, factor ); 
            //rightDownCorner
            g.drawLine( 0, factor, factor, 250 );  
            //rightUpperCorner
            g.drawLine( 250, factor, 250 - factor, 250 ); 
            //g.drawLine( 950, 500, 700 + factor, 500 - factor );
           // g.drawLine( 950, 250, 950 - factor, 500 - factor );
            
            
            factor += 25;
            
        }
    }
    
  
public static void main( String[] args ){
    
    JFrame frame = new JFrame();
    LinesSquare panel = new LinesSquare();
    
    frame.setSize( 1500, 1500 );
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.add(panel);
    }  
}
