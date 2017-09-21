package drawpanel;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * @author Dimitrios
 */
public class DrawPanel extends JPanel{
    public void paintComponent( Graphics g ){
        super.paintComponent(g);
        int lineCounter = 0, i= 0, j=0, k = 0, l=0;
        int width = getWidth();
        int height = getHeight(); 
      
        while(lineCounter++ <= 60){
            g.drawLine( j, j-k, i, 250-i+k+l);
           
            if(lineCounter<15)
            {
                i += 15;
                k=l=0;
                continue;
            }
            if(lineCounter<30)
            {
                j = 250;
                k = l = 0;
                if(15 == lineCounter)
                {
                    i = 0;
                    continue;
                }
                i+=15;
            }
            
           
            
            
        }}
    public static void main(String[] args) {
         DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        application.add( panel );
        application.setSize( 500, 500 );
        application.setVisible(true);
    }}
