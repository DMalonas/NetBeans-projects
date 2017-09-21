
package drawsmiley;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class DrawSmiley extends JPanel{

    public void paintComponent( Graphics g ){
        
        super.paintComponent( g );
        
        //draw the face
        g.setColor( Color.YELLOW );
        g.fillOval(200, 200, 500, 500);
        
        //draw the eyes
    g.setColor( Color.BLACK );
        
        g.fillOval(405, 665, 30, 30);
        g.fillOval(485, 665, 30, 30);
              
        
        Random randomColors = new Random();
        int value; 
        for( int k= 0; k<10; ++k ){
            value = 1 + randomColors.nextInt(10);
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
            
        }
        
        
        
      
       
              
              for( int j = 0; j < 30; ++j ){
            g.fillOval(325 +j*2, 280 + j, 30, 30);
            g.fillOval(545 -j*2, 280 + j, 30, 30);
        }
            g.setColor( Color.BLACK );      
        //draw the mouth
        g.fillOval(400, 460, 120, 60);
        
        //TOUch up the mouth int a smile
         g.setColor( Color.YELLOW );
         g.fillRect( 400, 460, 120, 30); 
        g.fillOval(400, 470, 120, 40);
     
        
        Random randomColors2 = new Random();
        Random randomColors3 = new Random();

        
         int i;
        for( i = 10; i > 0; --i ){
            value = 1 + randomColors.nextInt(10);
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
              g.fillOval(340 - 5 * i , 380 - 5 * i , 10 + i * 10, 10 + i * 10);
           
            
              g.fillOval(540 - 5 * i , 380 - 5 * i , 10 + i * 10, 10 + i * 10);

            
        }
        

        /**
             if( i % 2 == 0 ){
                           System.out.print("2\n");
                 g.setColor(Color.BLUE );
             }
             else if ( i%2!=0) {
                           System.out.print("1\n");
                g.setColor(Color.RED);
             }
             * 
             * */
                  
    }
    
    
    
    
    public static void main(String[] args) {
    
        DrawSmiley panel = new DrawSmiley();
        JFrame application = new JFrame();
    
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize( 1000, 1000 );
        application.add(panel);
        application.setVisible(true);
     
    }
    
}
