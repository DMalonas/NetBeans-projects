

package hollowsquare3;

import javax.swing.JOptionPane;


public class HollowSquare3 {

    public static void main(String[] args) {
        
    int numberOfAsterisks, topSide, bottomSide, counter=0, temp;
    
    JOptionPane.showMessageDialog(null, String.format("Side Size: %d asterisks",
        numberOfAsterisks = Integer.parseInt(JOptionPane.showInputDialog("Enter Side Side: ") ) ) );
   
    //print top side
    topSide = temp = numberOfAsterisks; 
    for(;;){
        while( ( topSide-- ) >= 1 ){ 
        System.out.print("* ");
    }
    if(counter == 1) return;
    counter++; 
    topSide = temp = numberOfAsterisks;
    while( ( topSide-- ) > 2){
        System.out.print("\n*");
        for( temp =numberOfAsterisks ; temp >= 1; temp-- ){
            System.out.print(" ");
        }
        System.out.print("*");
    }
    System.out.print("\n");
    temp= topSide = numberOfAsterisks;
   }
  }
}