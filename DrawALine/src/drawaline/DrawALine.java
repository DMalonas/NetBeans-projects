package drawaline;

import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;


public class DrawALine extends JPanel{
    
    public void paintComponent( Graphics g ){
        super.paintComponent( g );
        
        g.drawLine(0, 0, 500, 500);
    }
    
    
    
    public static void main( String[] args ){
        
        DrawALine panel = new DrawALine();
        JFrame frame = new JFrame();
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        
        int sum = 0 , x = 0; 
        int r= 5, b = 5;
        
        System.out.printf(" %d ", r*=b++);
        while( x++ < 10 )
        {
            
            System.out.printf("sum = %d\tx = %d\n",sum +=x, x);
        }
        
    }
}