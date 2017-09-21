
package showdialog2;

import javax.swing.JOptionPane;
import java.util.Scanner;


public class ShowDialog2 
{
    public static void main(String[] args) 
    {     
     int a, b, c;
     
     JOptionPane.showMessageDialog(null, String.format( "Integer a: %d", a = Integer.parseInt(JOptionPane.showInputDialog("Enter integer a: " ) ) ) );
     
     JOptionPane.showMessageDialog( null, String.format( "Integer a: %d", b = Integer.parseInt( JOptionPane.showInputDialog( "Enter integer b: ") ) ) );
     
     JOptionPane.showMessageDialog( null, String.format( "Integer b: %d", c =Integer.parseInt( JOptionPane.showInputDialog( "Enter Integer c: ") ) ) );
     
     JOptionPane.showMessageDialog( null, String.format( " Product = %d", a * b * c ) );
     
     
      
        
   
        
   
//        JOptionPane.showMessageDialog(null, String.format(" number = %d", in.nextInt() ) ); 
     
     
     
     
     
     return;    
    }
    
    
}








