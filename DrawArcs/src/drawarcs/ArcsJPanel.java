
package drawarcs;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;

public class ArcsJPanel extends JPanel
{
    public void paintComponent( Graphics g )
    {
        super.paintComponent(g);
        
        
        //start at 0 and sweep 360 degrees
        //g.setColor(Color.RED);
        //g.drawRect(15, 35, 80, 80);
        //g.setColor(Color.BLACK);
        //g.drawArc(15, 35, 80, 80, 0, 360);
        
        
        //start at 0 and sweep 110 degrees 
        //g.setColor(Color.RED);
        //g.drawRect(185, 35, 80, 80);
        //g.setColor(Color.BLACK);
        //g.drawArc(100, 35, 80, 80, 0, 110);

        
        //start at 0 and sweep -170 degrees
     //   g.setColor(Color.RED);
      //  g.drawRect(185, 35, 80, 80);
       // g.setColor(Color.BLACK);
        //g.drawArc(185, 35, 80, 80, 0, -270);
        
        
        // start at 0 and sweep 360 degrees 
   g.fillArc(35,120,80,40,0,-180);
        
        //start at 270 and sweep -90 degrees
    //    g.fillArc(100,120,80,40,0,-270);
    
   // g.fillArc(185,120,80,40,0,-90);
  
    
   //   g.setColor(Color.BLACK);
 //       g.drawArc(105, 35, 80, 80, 0, -90);
    
     g.fillArc(165,120,80,40,0,-180);
     
     
      g.setColor(Color.GREEN);
     g.fillArc(12,650,80,40,180,-90);
     
       g.fillArc(110,650,80,40,0,90);
     
      g.setColor(Color.BLACK);
     g.drawLine(50, 250, 220, 250);
     
     g.drawOval(20, 70, 250, 250);
     
     g.drawLine(50, 250, 220, 250);
     g.drawLine(100,310,100,600);
     g.drawLine(50,600,150,600);
     g.drawLine(50,600,50,650);
     g.drawLine(150,600,150,650);
     
     
     
     
     //2ND PERSON ON THE left
      g.fillArc(235,120,80,40,0,-180);
      g.fillArc(365,120,80,40,0,-180);
     
     
      g.setColor(Color.GREEN);
      g.fillArc(212,650,80,40,180,-90);
     
      g.fillArc(310,650,80,40,0,90);
     
      g.setColor(Color.BLACK);
      g.drawLine(250, 250, 420, 250);
     
      g.drawOval(220, 70, 250, 250);
     
      g.drawLine(250, 250, 420, 250);
      g.drawLine(300,310,300,600);
      g.drawLine(250,600,350,600);
      g.drawLine(250,600,250,650);
      g.drawLine(350,600,350,650);
      
      
      
      //3rd person on the right
    
        g.setColor(Color.GREEN);
      g.fillArc(535,120,80,40,0,-180);
      g.fillArc(665,120,80,40,0,-180);
     
         g.setColor(Color.BLACK);
    
      g.fillArc(612,650,80,40,180,-90);
     
      g.fillArc(710,650,80,40,0,90);
     
  
      g.drawLine(550, 250, 720, 250);
     
      //face
      g.drawOval(520, 70, 250, 250);
     
      g.drawLine(550, 250, 720, 250);
      g.drawLine(700,310,700,600);
      g.drawLine(650,600,750,600);
      g.drawLine(650,600,650,650);
      g.drawLine(750,600,750,650);
      
      g.setColor(Color.RED);
      g.drawLine(585,150,230,180);
      g.drawLine(715,150,230,180);  
       

    }
}
