
package labeldemo;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JFrame;


public class LabelDemo extends JLabel{

    public static void main(String[] args) {
        
      
    ImageIcon sievaIcon = new ImageIcon( "C:/Users/Dimitrios/Downloads/2013-10-19 22.33.39.jpg" );
    JLabel label0 = new JLabel( sievaIcon );
    label0.setText( "sieva" ); 
    
    JFrame app = new JFrame();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    app.setSize( 1000, 1000 );
    app.setVisible( true );     
    
    app.add( label0, BorderLayout.CENTER );        
    }
    
}
