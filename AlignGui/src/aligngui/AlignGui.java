
package aligngui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AlignGui extends JFrame{

    public static void main(String[] args) {
        Gui1 gui1 = new Gui1();
        gui1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui1.setSize( 200, 200 );
        gui1.setVisible( true );
    
        
    }
    
}


class Gui1 extends JFrame{
    
   private JCheckBox checkBox1, checkBox2;
   private JLabel empty, x, y, checkBoxLabel1, checkBoxLabel2;
   private JButton buttons[];
   private BorderLayout layout; 
   private GridLayout gridLayout1; 
   private JPanel panel1;
 
   
   
   public Gui1(){
       super("Align");
       

       //left side
      panel1 = new JPanel( new GridLayout( 4, 1, 5, 5) ); 
      empty = new JLabel(""); 
      for( int count = 0; count < 2; count++ )
          panel1.add(empty);
      checkBox1 = new JCheckBox();
      checkBox2 = new JCheckBox();
      panel1.add(checkBox1);
      panel1.add(checkBox2);
         
       
      add( panel1 );

       
   }
}
