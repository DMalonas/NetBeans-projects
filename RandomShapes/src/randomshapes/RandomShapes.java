
package randomshapes;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.util.Random;

public class RandomShapes extends JPanel {
 public void paintComponent( Graphics g){
        
        super.paintComponent( g );
        
         /**
          * g.drawRect( 240 + i * 10, 10 + i * 10,
                    50 + i * 10, 50 + i * 10 );
            g.drawOval( 240 + i * 10, 10 + i * 10,
                    50 + i * 10, 50 + i * 10 );
          */ 
         int i, z, k, u, a, x, n, sa, v, value;
         
         Random randomColors = new Random();
         Random randomColors2 = new Random();
         Random randomColors3 = new Random();
         Random randomColors4 = new Random();
         Random randomColors5 = new Random();
       Random randomColors6 = new Random();
                Random randomColors10 = new Random();  
       Random randomColors7 = new Random();
         for( i = 10; i > 0; --i ){
            value = 1 + randomColors.nextInt(10);
             sa = 1 + randomColors2.nextInt(900);
             z = 1 + randomColors10.nextInt(110);
             k = 1 + randomColors3.nextInt(900);
            v =  1 + randomColors4.nextInt(500);
             n =  1 + randomColors5.nextInt(50);
             x = 1 + randomColors6.nextInt(600);
             u = a = 1 + randomColors7.nextInt(150);
             switch(value){
                case 1:
                    g.setColor(Color.red);
                break;
                  
                case 2:
                  g.setColor(Color.blue);
                break;
                
                case 3:
                  g.setColor(Color.yellow);
                break;
                
                case 4:
                  g.setColor(Color.gray);
                break;
                
                case 5:
                  g.setColor(Color.CYAN);
                break;
                
                case 6:
                  g.setColor(Color.GREEN);
                break;      
                
                case 7:
                  g.setColor(Color.magenta);
                break;
                
                case 8:
                  g.setColor(Color.PINK);
                break;
                
                case 9:
                  g.setColor(Color.orange);
                break;
                
                case 10:
                  g.setColor(Color.darkGray);
                break;     
            }
              //g.fillRect(340 - 5 * i , 380 - 5 * i , 10 + i * 10, 10 + i * 10);
           
            
              //g.fillOval(540 - 5 * i , 380 - 5 * i , 10 + i * 10, 10 + i * 10);
            g.fillRect( k  , sa, u, a);
            g.fillOval( v , x, z, n);
            
        
            
          
            
        }}

    public static void main(String[] args) {
         RandomShapes panel = new RandomShapes();
        JFrame fr = new JFrame();
   
        fr.setSize(1000, 1000);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.add(panel);
    }

}
