package sumarray;

import javax.swing.JOptionPane;

public class SumArray{
    public static void main( String[] args ){
    int[] array = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
    int total = 0;
    
    for ( int i = 0; i < array.length; ++i )
        total += array[ i ];
    JOptionPane.showMessageDialog(null, String.format("Total is %d ", total));
    
    }
   
}