
package drawrainbow;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JFrame;


public class DrawRainbow extends JPanel
{
    
    public void paintComponent( Graphics g )
    {
        super.paintComponent ( g );
        
        Color VIOLET = new Color(128,0,128);
        Color INDIGO = new Color(75,0,130);
        
        
        Color[] colors = 
        { Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
          Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED 
        };
                    
        int radius = 20;
        
        int positionCounter = 0;
        
        for(positionCounter=0; positionCounter < 3; positionCounter++)
        {
             int centerX = 0;
             int centerY = 0; 
            if(0==positionCounter)
            {
                centerX = getWidth() / 5;
                centerY = getHeight() - 600; 
            }
            else if(1 == positionCounter )
            {
                 centerX = (getWidth()/2) + 200;
                 centerY = getHeight() - 600; 
            }
            else if( 2 == positionCounter)
            {
                centerX = (getWidth()/2 -50);
                 centerY = getHeight() - 100; 
            }
           
            for(int counter = colors.length; counter > 0; counter--)
            {
              if(0 == positionCounter || 1== positionCounter)
              {
                g.setColor(colors[counter -1 ]); 
                g.fillArc( centerX - counter * radius, 
                       centerY - counter * radius,
                       counter * radius * 2, counter * radius * 2, 0, 180);
              }
              else if( 2 == positionCounter)
              {
                     
                   //draw the face
                  //  g.setColor(Color.YELLOW);
                 //   g.fillOval(100, 100, 200, 200);    //10, 10,s,s
        
        
                    //draw the eyes
                    g.setColor(Color.BLACK);
                    g.fillOval(651, 311, 80, 80);
                    g.fillOval(156, 311, 80, 80);
    
    
                     //draw the mouth
                    g.fillOval(290,800,280,60);
        
                     //"touch up" the mouth into a smile
                    g.setColor(Color.YELLOW);
                    g.fillRect( 290, 800, 280, 30);
                    g.fillOval(290, 810, 280, 40);
              }
            }
       }
    }
    
    
    public static void main(String[] args)  
    {
        DrawRainbow panel = new DrawRainbow();
        JFrame application = new JFrame();
        
        
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(1000,1000);
        application.setVisible(true);
        }
}
