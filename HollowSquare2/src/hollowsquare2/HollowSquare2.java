

package hollowsquare2;

import javax.swing.JOptionPane;

public class HollowSquare2 {

    public static void main(String[] args) {
    
        int numberOfAsterisks, topSide, bottomSide, counter, temp;
        
         JOptionPane.showMessageDialog(null, String.format("Side Size: %d asterisks",
                numberOfAsterisks = Integer.parseInt(JOptionPane.showInputDialog("Enter Side Side: ") ) ) );
         

         for( counter = 0; counter < numberOfAsterisks; counter ++ ){
             if( 0 == counter || counter == numberOfAsterisks-1 ){
                 temp = counter;
                 counter = 0;
                 while( counter++ < numberOfAsterisks ){
                     System.out.print("* ");
                 }
                 if( temp == numberOfAsterisks-1 ) {
                     System.out.print("*\n" );
                     return;
                 }
                 counter = 1;
             }
             System.out.print("* ");
             for( int secondCounter = 1; secondCounter < ( numberOfAsterisks -1 );
                    secondCounter++ ){
                 System.out.print("  ");
             }
             System.out.print("  *\n");
}}}
