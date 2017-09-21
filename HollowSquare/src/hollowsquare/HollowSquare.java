
package hollowsquare;

import javax.swing.JOptionPane;


public class HollowSquare {


    public static void main(String[] args) {
        
        int a, horizontal, temp;
        
        JOptionPane.showMessageDialog(null, String.format("Side Size: %d",
                a = Integer.parseInt(JOptionPane.showInputDialog("Enter Side Side: ") ) ) );
        temp = horizontal = a;
        
        while( (a--) > 0 ){
            //horizontal side
            if( (a+1) == horizontal || 1 == a ){
                while((horizontal--) > 0)
                   System.out.print("*");
                horizontal = a + 1;
                }
                else{
                    System.out.println();
                    System.out.print("*");
                    temp = horizontal;
                    while( ( horizontal-- ) > 0 )
                        System.out.print(" ");
                    if( 0 == horizontal ){
                        
                    }
                }
            }
            
            
            /**else{
                System.out.print("*");
                for( int i = 1; i < ( horizontal-1 ); i++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
        }
    }
    */
        }
}
