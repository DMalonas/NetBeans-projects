
package scannerdialog2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ScannerDialog2 
{


    public static void main(String[] args)
    {
        int a, b, c, d, max, min; 
        
        Scanner in = new Scanner( System.in );
       
        
            System.out.print( "\nGrade a: " );
            a = in.nextInt();
            System.out.print( "\nGrade b: " );
            b = in.nextInt();
/**
            if( a > b )
                System.out.printf("a%sb"," is larger than " );
            else if( a < b)
                System.out.printf("b%sa", " is larger than " );
            else
                System.out.print( "a == b" );
   */         
            JOptionPane.showMessageDialog( null, ( a >= 90 ) ? "A" : ( a >= 80 ) ? "B" : ( a >= 70 ) ? "C" : ( a >= 60 ) ? "D" : "F" );
            System.out.println( ( a >= 90 ) ? "A" : ( a >= 80 ) ? "B" : ( a >= 70 ) ? "C" : ( a >= 60 ) ? "D" : "F"  );
            
            max = min = a;
            
            if( a > 5)
                if( b > 5)
                    System.out.println( "xxxx");
                else 
                    System.out.println("asx");
   //     JOptionPane.showMessageDialog( null, String.format( "a = %d ", c = Integer.parseInt( JOptionPane.showInputDialog( "Grade c: " ) ) ) );
        
        
     //   JOptionPane.showMessageDialog( null, String.format( "d = %d ", d = Integer.parseInt( JOptionPane.showInputDialog( "Grade d: " ) ) ) );
        
        
       
       // JOptionPane.showMessageDialog( null, ( c > d ) ? "c > d" : ( c < d ) ? " c < d " : "c == d" );
        
        
        /**if( c > d )
            JOptionPane.showMessageDialog( null," c > d" );
        if( c < d )
            JOptionPane.showMessageDialog( null," c < d" );
        if( c == d )
            JOptionPane.showMessageDialog( null," c = d" );  
        */
        
        return;
    }
    
}
