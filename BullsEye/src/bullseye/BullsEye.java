
package bullseye;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class BullsEye extends JPanel{
    public void paintComponent( Graphics g ){
        super.paintComponent(g);
       
                  
        int i; 
        for( i = 10; i > 0; --i ){
            
            if ( 0 == i%2 ){
                g.setColor(Color.red);
            }
            else{
                g.setColor(Color.blue);
            }
            
            g.fillOval(340 - 5 * i , 380 - 5 * i , 10 + i * 10, 10 + i * 10);
            g.fillOval(540 - 5 * i , 380 - 5 * i , 10 + i * 10, 10 + i * 10);
            System.out.print("really");
        }
    }

    public static void main(String[] args) {
        
        JFrame f = new JFrame();
        BullsEye p = new BullsEye();
        
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1000,1000);
        f.add(p);
        f.setVisible(true);
    }
    
    
}
