


package bullseyesimulator;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;



public class BullsEye extends JPanel
{

    
   RandomColorGenerator randomColors = new RandomColorGenerator();  
  
   public void paintComponent( Graphics g )
    {
        int colorValue=0; 
        
        super.paintComponent( g );
        
        
        
        for( int i = 0; i < 3; i++ )
        {
            randomColors.generateNumber();
            System.out.printf("%d\n",colorValue);
            switch(colorValue)
            {
                case 0:
                    g.setColor(Color.RED);
                    break;
                case 1:
                    g.setColor(Color.YELLOW);
                    break;
                case 2:
                    g.setColor(Color.BLUE);
                    break;
            }
            
            g.fillOval(150 + i * 50 / 2, 150 + i * 50 / 2, 200 - i * 50, 200 - i * 50 );
            
        }
    }
}
