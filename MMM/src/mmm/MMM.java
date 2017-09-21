
package mmm;

import javax.swing.JOptionPane;


public class MMM 
{
    


    public static void main(String[] args)
    {
        int a, b, c, max, min, avg; 
        
        JOptionPane.showMessageDialog(null,String.format( " a = %d", min = max = a = Integer.parseInt( JOptionPane.showInputDialog(" Enter Input for a ") ) ) );
        JOptionPane.showMessageDialog(null,String.format( " b = %d", b = Integer.parseInt( JOptionPane.showInputDialog(" Enter Input for b ") ) ) );
        JOptionPane.showMessageDialog(null,String.format( " c = %d", c = Integer.parseInt( JOptionPane.showInputDialog(" Enter Input for c ") ) ) );
 
        if( b > max )
            max = b;
        if ( c > max )
            max = c;
        if( b < min )
            min = c;
        if ( c < min )
            min = c;
        avg = a + b + c - max - min;
        
       JOptionPane.showMessageDialog( null, String.format( "max = %d\n min = %d\n avg = %d" , max, min, avg ) );
       JOptionPane.showMessageDialog( null, String.format( "\naverage = %d\n", (max + min + avg) / 3));
       
      int g, i = 8;
      for( i = 1; i <= 8; i++ )
      {
          g = i;
          if( (g % 2) == 0 )
             System.out.print("******************");
          else
              System.out.print("\n ******************\n");
      }
    }
}
    